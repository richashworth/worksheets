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

// Cats provides syntactic sugar for working with monads.
// Note that _.pure comes from Applicative; _.flatMap comes from FlatMap and _.map from Functor
// (which Applicative extends)

import cats.syntax.applicative._

val helloOpt = "Hello".pure[Option]
println(helloOpt)

// We can write functions that act on Monads:

import scala.language.higherKinds
import cats.syntax.functor._
import cats.syntax.flatMap._

def sumSquare[M[_] : Monad](a: M[Int], b: M[Int]): M[Int] =
    a.flatMap(x => b.map(y => x*x + y*y))

import cats.instances.option._
import cats.instances.list._

sumSquare(Option(3), Option(4))
// res8: Option[Int] = Some(25)
//
// sumSquare(List(1, 2, 3), List(4, 5))
// // res9: List[Int] = List(17, 26, 20, 29, 25, 34)
