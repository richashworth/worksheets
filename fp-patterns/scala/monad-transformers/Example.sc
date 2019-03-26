import $ivy.`org.typelevel::cats:0.9.0`

import cats.data.{EitherT, OptionT}
import cats.syntax.applicative._

type ListEither[A] = EitherT[List, String, A]

type ListEitherOption[A] = OptionT[ListEither, A]

import cats.instances.list._ // for Monad
import cats.instances.either._ // for Monad

val listEitherOr: ListEitherOption[Int] =
    for {
    a <- 10.pure[ListEitherOption]
    b <- 32.pure[ListEitherOption]
  } yield a + b


println(listEitherOr)
println(listEitherOr.value)
println(listEitherOr.value.value)

