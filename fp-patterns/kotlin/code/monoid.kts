// --- Library Code ---

interface Semigroup<T> {
  fun combine(x: T, y: T): T
}

interface Monoid<T> : Semigroup<T> {
  fun empty(): T
  fun combineAll(ts: Collection<T>): T =
    if (ts.isEmpty()) empty()
    else ts.reduce { x, y -> combine(x,y) }
}

// --- Domain model --- 

sealed class Currency(val name: String, val fxRate: Double) {
  object GBP : Currency("GBP", 1.0)
  object EUR : Currency("EUR", 1.5)
  object USD : Currency("USD", 0.5)
}

data class Payment(val amount: Double, val ccy: Currency)

// --- Type class instances we want to use ---

object PaymentMonoid : Monoid<Payment> {
  override fun empty(): Payment = Payment(0.0, Currency.GBP)

  override fun combine(x: Payment, y: Payment): Payment =
    Payment(x.amount * x.ccy.fxRate + y.amount * y.ccy.fxRate, Currency.GBP)
}


// --- Business Logic

val p1 = Payment(100.0, Currency.GBP)
val p2 = Payment(200.0, Currency.EUR)
val p3 = Payment(300.0, Currency.USD)

println(PaymentMonoid.combine(p1, p2))

println(PaymentMonoid.combineAll(listOf(p1, p2, p3)))
