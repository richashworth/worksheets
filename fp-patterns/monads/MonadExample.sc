import $ivy.`org.typelevel::cats:0.9.0`

import cats.instances.list._
import cats.instances.option._
import cats.Monad

// Since cats provides a monad instance for Option[_], we can use pure to wrap a value in an Option
val opt1 = Monad[Option].pure(5)
println(opt1)
// Some(5)

// Similarly for List:
val list1 = Monad[List].pure("Aladdin Sane")
println(list1)
// List("Aladdin Sane")

// We can use flatMap:
val opt2 = Monad[Option].flatMap(opt1)(a => Some(a * 2))
println(opt2)
// Some(10)

// ...and map:
val opt3 = Monad[Option].map(opt1)(a => a - 4)
println(opt3)
// Some(1)

// Note that to use Monad[Future], we must have an implicit ExecutionContext in scope.

// This is used for subsequent calls to pure and flatMap
import scala.concurrent.ExecutionContext.Implicits.global

// Cats provides syntactic sugar for working with monads.  Note that _.pure comes from Applicative;
// _.flatMap comes from FlatMap; and _.map from Functor (which Applicative extends)

import cats.syntax.applicative._

val helloOpt = "Hello".pure[Option]
println(helloOpt)

// We can write functions that act on Monads:

import cats.syntax.flatMap._
import cats.syntax.functor._
import scala.language.higherKinds

def sumSquare[M[_] : Monad](a: M[Int], b: M[Int]): M[Int] =
    a.flatMap(x => b.map(y => x*x + y*y))

import cats.instances.list._
import cats.instances.option._

println(sumSquare(Option(3), Option(4)))
// Some(25)

println(sumSquare(List(1, 2, 3), List(4, 5)))
// List(17, 26, 20, 29, 25, 34)

// We can rewrite calls to flatMap and map as a for comprehension:

def sumSquareWithFor[M[_] : Monad](a: M[Int], b: M[Int]): M[Int] = 
  for {
   x <- a
   y <- b
  } yield (x * x) + (y * y)

println(sumSquareWithFor(Option(3), Option(4)))
// Some(25)

// Let's use this with a monad instance for a higher-kinded type of our own:

case class Box[A](value: A)

implicit val boxMonad = new Monad[Box] {
  def pure[A](value: A): Box[A] = new Box(value)
  def flatMap[A, B](boxed: Box[A])(func: A => Box[B]): Box[B] = func(boxed.value)
  def tailRecM[A, B](a: A)(f: (A) ⇒ Box[Either[A, B]]): Box[B] = ???
}

val a = Box(3)
val b = Box(4)

val newBox = sumSquareWithFor(a, b)
println(newBox)
// Box(25)
