# Functors

## Contravariant and Invariant Functors

`Functor` and `Contravariant` are specialisations of `Invariant` in cats. They are found in the
`cats.functor` package.

```
trait Invariant[F[_]] {
  def imap[A, B](fa: F[A])(f: A => B)(g: B => A): F[B]
}

trait Contravariant[F[_]] extends Invariant[F] {
  def contramap[A, B](fa: F[A])(f: B => A): F[B]

  def imap[A, B](fa: F[A])(f: A => B)(fi: B => A): F[B] =
    contramap(fa)(fi)
}

trait Functor[F[_]] extends Invariant[F] {
  def map[A, B](fa: F[A])(f: A => B): F[B]

  def imap[A, B](fa: F[A])(f: A => B)(fi: B => A): F[B] =
    map(fa)(f)
}
```

They are useful in using a functor instances of a particular type from another type. E.g. if we have
a `Printable[String]`, then if we can convert `Person` to `String` with some function, then we can
use `contramap` to get a `Printable[Person]` without having to define a new instance of Printable
explicitly.

Cats provides instances of `Invariant` for the `Semigroup` and `Monoid` type classes. There is also
an `imap` extension method. So if we have a semigroup for `String` and we want to convert it to a
semigroup for `Symbol`, we can write:

```
import cats.Semigroup
import cats.instances.string._ // semigroup for String
import cats.syntax.invariant._ // imap extension method

implicit val symbolSemigroup: Semigroup[Symbol] =
  Semigroup[String].imap(Symbol.apply)(_.name)

  import cats.syntax.semigroup._

  'a |+| 'few |+| 'words
  // res7: Symbol = 'afewwords
```

Regular functors are more common than contravariant or invariant functors, 
