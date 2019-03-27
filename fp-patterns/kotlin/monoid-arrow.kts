@file:DependsOn("io.arrow-kt:arrow-core-data:0.9.0")
@file:DependsOn("io.arrow-kt:arrow-core-extensions:0.9.0")

import arrow.*
import arrow.core.extensions.*
import arrow.typeclasses.*

sealed class Currency(val name: String, val fxRate: Double) {
    object GBP : Currency("GBP", 1.0)
    object EUR : Currency("EUR", 1.5)
    object USD : Currency("USD", 0.5)
}

data class Payment(val amount: Double, val ccy: Currency)

val PaymentMonoid: Monoid<Payment> = object: Monoid<Payment> {
  override fun empty(): Payment = Payment(0.0, Currency.GBP)
  override fun Payment.combine(b: Payment): Payment =
    Payment(amount * ccy.fxRate + b.amount * b.ccy.fxRate, Currency.GBP)
}


// --- Business Logic

val p1 = Payment(100.0, Currency.GBP)
val p2 = Payment(200.0, Currency.EUR)
val p3 = Payment(300.0, Currency.USD)

PaymentMonoid.run {
  // + syntax for combine is available from Semigroup
  println(p2 + p3)
  println(listOf(p1,p2,p3).combineAll())
}

// println(PaymentMonoid.combineAll(listOf(p1, p2, p3)))
