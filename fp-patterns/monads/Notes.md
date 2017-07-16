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
* *Left identity*: `pure(a).flatMap(f) == f(a)`
* *Right identity*: `m.flatMap(pure) == m`


