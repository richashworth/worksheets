import $ivy.`org.typelevel::cats:0.9.0`
import $ivy.`com.lihaoyi::utest:0.4.8`

import scala.language.higherKinds
import cats.Monad
import cats.syntax.functor._
import cats.syntax.flatMap._

def sumSquare[M[_]: Monad](a: M[Int], b: M[Int]): M[Int] =
  for {
    x <- a
    y <- b
  } yield x*x + y*y

// We cannot pass in plain values to sumSquare. For example, sumSquare(3, 4) does not compile. To
// bridge this gap, we can use the Identity monad (the effect of no effect), implemented in cats as
// Id:

import cats.Id

val res = sumSquare(3: Id[Int], 4: Id[Int])
println(res)
// res: cats.Id[Int] = 25

// Notice that we haven’t had to add any casts to any of the examples in this solution. Scala is
// able to interpret values of type A as Id[A] and vice versa, simply by the context in which they
// are used.
