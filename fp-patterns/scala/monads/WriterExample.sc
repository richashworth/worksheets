import $ivy.`org.typelevel::cats:0.9.0`

import cats.data.Writer
import cats.instances.vector._

val x = Writer(Vector("msg1"), 3)
val y = Writer(Vector("msg2"), 4)

val z = for {
    a <- x
    b <- y
  } yield a + b

println(z)

println(z.value)
println(z.written)

val (log, result) = z.run

println("log "+log)

type Logged[A] = Writer[Vector[String], A]

import cats.syntax.applicative._
123.pure[Logged]

import cats.syntax.writer._
val writer1 = for {
  a <- 10.pure[Logged] // no log
  _ <- Vector("a", "b", "c").tell // no value
  b <- 32.writer(Vector("x", "y", "z")) // log and value
} yield a + b // map transforms the result

println(writer1)
// WriterT((Vector(a, b, c, x, y, z),42))

// we can transform the log with mapWritten:
val writer2 = writer1.mapWritten(_.map(_.toUpperCase))
println(writer2)
// WriterT((Vector(A, B, C, X, Y, Z),42))

// We can transform both log and result in the same operation using bimap or mapBoth:
// We can also clear the log with `reset`, or switch the result and log with `swap`.


// Example
def slowly[A](body: => A) =
    try body finally Thread.sleep(100)

def factorial(n: Int): Int = {
  val ans = slowly(if(n == 0) 1 else n * factorial(n - 1))
  println(s"fact $n $ans")
  ans
}

println(factorial(5))
// fact 0 1
// fact 1 1
// fact 2 2
// fact 3 6
// fact 4 24
// fact 5 120
// 120

// see writer-monad-exmample project for multi-threaded example
