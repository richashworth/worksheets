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
// bridge this gap, we can use the Identity monad, implemented in cats as Id:

import cats.Id

val res = sumSquare(3: Id[Int], 4: Id[Int])
println(res)
// res: cats.Id[Int] = 25

/* From the cats documentation:
 *
 * type Id[A] = A
 * Identity, encoded as type Id[A] = A, a convenient alias to make identity instances well-kinded.
 *
 * The identity monad can be seen as the ambient monad that encodes the effect of having no effect.
 * It is ambient in the sense that plain pure values are values of Id.
 *
 * For instance, the cats.Functor instance for cats.Id allows us to apply a function A => B to an
 * Id[A] and get an Id[B]. However, an Id[A] is the same as A, so all we're doing is applying a pure
 * function of type A => B to a pure value of type A to get a pure value of type B. That is, the
 * instance encodes pure unary function application.
 */
