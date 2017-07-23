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

val fm = Monad[Future]
Await.result(
  fm.flatMap(fm.pure(1)) { x =>
    fm.pure(x + 2)
  },
  Duration.Inf
)
// res3: Int = 3

// Cats provides syntactic sugar for working with monads.
