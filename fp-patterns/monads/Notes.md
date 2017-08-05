# Monads

> A monad is a control mechanism for sequencing computations
  -- [Advanced Scala with Cats](http://underscore.io/books/advanced-scala/)

Monads allow us to provide the computation (as a function parameter to `flatMap`), and based on the
type of monad, it will handle the relevant 'effect'. In the case of `Option`, this effect is that
the computation may not return a value; for `Future` the effect is asynchronous execution.

For Lists, `flatMap` is useful for dealing with permutations and combinations:

```
def numbersBetween(min: Int, max: Int): List[Int] =
  (min to max).toList

for {
  x <- numbersBetween(1, 3)
  y <- numbersBetween(4, 5)
} yield (x, y) 

// List[(Int, Int)] = List((1,4), (1,5), (2,4), (2,5), (3,4), (3,5))
```

Remember that chaining `Futures` together means that they are run _sequentially_.

The monad behaviour is captured in two operations:

* `pure` with type `A => M[A]`
* `flatMap` with type `(M[A], A => M[B]) => M[B]`

and three laws:

* *Associativity*: flatMapping over `f` and `g` is the same as flatMapping over `f` and then
  flatMapping over `g`.
* *Left Identity*: `pure(a).flatMap(f) == f(a)`
* *Right Identity*: `m.flatMap(pure) == m`

Here is a simplified version of the Monad type class:

```
import scala.language.higherKinds

trait Monad[F[_]] {
  def pure[A](a: A): F[A]

  def flatMap[A, B](value: F[A])(func: A => F[B]): F[B]
}
```

Note that every monads are also functors. We can define `map` in terms of `pure and flatMap`:

```
def map[A, B](value: F[A])(f: A => B): F[B] = flatMap(value)(a => pure(f(a)))
```

## The Identity Monad

```
import cats.Id

val res = sumSquare(3: Id[Int], 4: Id[Int])
println(res)
// res: cats.Id[Int] = 25
```

The `Id` monad bridges the gap between monadic and non-monadic code. For example, the following does
not compile:

`sumSquare(3, 4)`

but we can use the `sumSquare` function with the following:

`sumSquare(3: Id[Int], 4: Id[Int])`

From Advanced Scala with Cats:
> Scala is able to cast automatically between Id and the underlying type based on the context in
> which they are used. The only restriction to this is that Scala cannot unify different shapes of
> type constructor when searching for implicits. Hence our need to cast to Id[A] in the call to
> sumSquare.

## Either

Either allows us to implement fail-fast error handling.

As of scala 2.12, `Either` is now right-biased: the right side is always the success case.

`cats.syntax.either._` allows us to write `2.asRight[String]`, as opposed to `Right(2)`. This helps
with type inference, as the expression is of type `Either[String, Int]`, rather than `Right[Nothing,
Int]`.

## Eval

`cats.Eval` provides an abstraction for three forms of evaluation:

* *now* — eager, memoized (equivalent to `val`)
* *later* — lazy, memoized (equivalent to `lazy val`)
* *always* — lazy, not memoized (equivalent to `def`)


