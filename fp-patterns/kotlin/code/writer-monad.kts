import kotlin.math.sqrt

// -- library code (or use Arrow type class)
class Writer<T : Any> private constructor(val value: T, s: String) {
  var log = "  ${s.padEnd(17)}: $value\n"
      private set

  fun bind(f: (T) -> Writer<T>): Writer<T> {
      val new = f(this.value)
      // Update the log every time we sequence a computation
      new.log = this.log + new.log
      return new
  }

  companion object {
      fun <T : Any> unit(t: T, s: String) = Writer<T>(t, s)
  }
}

fun root(d: Double) = Writer.unit(sqrt(d), "Took square root")
fun addOne(d: Double) = Writer.unit(d + 1.0, "Added one")
fun half(d: Double) = Writer.unit(d / 2.0, "Divided by two")

val iv = Writer.unit(5.0, "Initial value")

val fv = iv.bind(::root)
           .bind(::addOne)
           .bind(::half)

println("The Golden Ratio is ${fv.value}")
println("\nThis was derived as follows:-\n${fv.log}")
