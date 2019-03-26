import $ivy.`org.typelevel::cats:0.9.0`

// Cats provides convenient syntax for working with Either:
import cats.syntax.either._

val a = 3.asRight[String]
// a: Either[String, Int] = Right(3)

val b = 4.asRight[String]
// a: Either[String, Int] = Right(4)

val c = for {
  x <- a
  y <- b
} yield x*x + y*y

println(c)
// Right(25)

def successfulComputation: Either[String, Int]= {
  println("Executing successfulComputation")
  2.asRight[String]
}

def failingComputation: Either[String, Int]= {
  "Failed!".asLeft[Int]
}

def prog0 = for {
  x <- successfulComputation
  y <- successfulComputation
} yield x+y

println(prog0)
// Executing successfulComputation
// Executing successfulComputation
// Right(4)

def prog1 = for {
  x <- successfulComputation 
  y <- failingComputation
} yield y

println(prog1)
// Executing successfulComputation
// Left(Failed!)

def prog2 = for {
  x <- failingComputation
  y <- successfulComputation
} yield y

// NB prog2 demonstrates the fail-fast behaviour of Either
println(prog2)
// Left(Failed!)

def prog3 = for { 
  a <- 1.asRight[String]
  b <- "Error".asLeft[Int]
  b <- 6.asRight[String] } yield a+b

println("prog3")
println(prog3)
