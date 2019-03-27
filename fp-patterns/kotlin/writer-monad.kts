// We've  looked at type classes for concrete types, e.g. Strings, Developers, Payments

// The next type class we'll look at deals with type constructors, e.g. List, Option Because these
// type classes abstract over something that is already polymorphic, they are called 'higher-kinded
// types'.

// The famous monad belongs in this category. It provides a pattern for sequencing computations

// The computations that we are going to sequence are described by the type constructor that we will
// provide Monad instances for: e.g. List<T> describes some computation; Option<T> describes
// another. This will give us a clean way of chaining these computations together where the results
// from previous computations can be used subsequently.

// The monad type class gives us everything we need to describe a sequenced computation (without any
// of the specifics of how this will work for particular _types_ of computation:

// trait M[A] {
//   def flatMap[B](f: A => M[B]): M[B]
// }
//
// def unit[A](x: A): M[A]

import kotlin.math.sqrt

class Writer<T : Any> private constructor(val value: T, s: String) {
  var log = "  ${s.padEnd(17)}: $value\n"
      private set

  fun bind(f: (T) -> Writer<T>): Writer<T> {
      val new = f(this.value)
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

fun main(args: Array<String>) {
  val iv = Writer.unit(5.0, "Initial value")
  val fv = iv.bind(::root).bind(::addOne).bind(::half)
  println("The Golden Ratio is ${fv.value}")
  println("\nThis was derived as follows:-\n${fv.log}")
}
