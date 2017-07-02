Monoids describe an aggregation pattern: whenever we need to combine or merge values of a particular
type, a monoid instance can be used to abstract the mechanics of the aggregation from the program's
business logic.  In this post, we will use the [LCD Digits kata that we tackled
previously](http://richashworth.com/2016/01/lcd-digits-with-scala/) as a motivating example. The
goal here is to transform a sequence of input digits into a string resembling their representation
on an LCD display. For example, given the input `"0123456789"`, the program should produce:

```
._. ... ._. ._. ... ._. ._. ._. ._. ._.
|.| ..| ._| ._| |_| |_. |_. ..| |_| |_|
|_| ..| |_. ._| ..| ._| |_| ..| |_| ..|
```

As before, we will use a case class to represent LCD Digits a product type:

```case class LCDDigit(firstRow: String, secondRow: String, thirdRow: String)```

We can then declare each digit as an instance of `LCDDigit` in the associated companion object:

```
object LCDDigit {
  val zero = LCDDigit(
    "._.",
    "|.|",
    "|_|"
  )
  val one   = LCDDigit("...", "..|", "..|")
  val two   = LCDDigit("._.", "._|", "|_.")
  val three = LCDDigit("._.", "._|", "._|")
  val four  = LCDDigit("...", "|_|", "..|")
  val five  = LCDDigit("._.", "|_.", "._|")
  val six   = LCDDigit("._.", "|_.", "|_|")
  val seven = LCDDigit("._.", "..|", "..|")
  val eight = LCDDigit("._.", "|_|", "|_|")
  val nine  = LCDDigit("._.", "|_|", "..|")
}
```

Whereas in our previous solution we used higher-order functions to handle the aggregation of digits,
in this case we will define a monoid instance for our `LCDDigit` type. A monoid is a specialisation
of a _semigroup_, i.e. a set with some associative operation `combine`, that also has some identity
element _id_ for which the following must be true: For all elements _s_ from the underlying set _S_,
combine(s, id) = combine(id, s) = s. In practice, these algebraic laws enable us to combine elements
from a (possibly empty) collection. For convenience, `Monoid` is provided as a type class in the
[cats](http://typelevel.org/cats/typeclasses/monoid.html) library as follows:

```
trait Semigroup[A] {
  def combine(x: A, y: A): A
}

trait Monoid[A] extends Semigroup[A] {
  def empty: A
}
```

For our `LCDDigit` type, we construct an instance of the `Monoid` trait, specifying in the `combine`
function how two `LCDDigit` values should be merged, and what value should be used as the identity
element. We will add this to our companion object so that the instance becomes available in the
implicit scope whenever the type is imported.

```
import $ivy.`org.typelevel::cats:0.9.0`, cats.Monoid

implicit val ConcatMonoid = new Monoid[LCDDigit] {
  override def empty = LCDDigit("", "", "")
  override def combine(l1: LCDDigit, l2: LCDDigit): LCDDigit =
      LCDDigit(
          l1.firstRow  + " " + l2.firstRow,
          l1.secondRow + " " + l2.secondRow,
          l1.thirdRow  + " " + l2.thirdRow)
}
```

We will omit the parsing of strings into sequences of `LCDDigit`s, since we can reuse the approach
from our previous solution, but we will add some syntactic sugar for working with this type in
the form of an implicit class. Also within the `LCDDigit` companion object, we declare the
following:

```
import $ivy.`org.typelevel::cats:0.9.0`, cats.Show

implicit val ShowInstance = Show.show[LCDDigit](_.productIterator mkString "\n")

implicit class Extensions(l1: LCDDigit) {
  def show = ShowInstance.show(l1)
  def merge(l2: LCDDigit) = ConcatMonoid.combine(l1, l2)
}
```

This allows us to format aggregations of LCDDigits as follows:

```
import LCDDigit._

val monoidInstance = implicitly[Monoid[LCDDigit]]

val fiveFourSix = Seq(five, four, six)
val digits = monoidInstance.combineAll(fiveFourSix)
println(digits.show)
  // ._. ... ._.
  // |_. |_| |_.
  // ._| ..| |_|

val noDigits = monoidInstance.combineAll(List())
println(noDigits.show)
  //
  //
  //

// Because `ConcatMonoid` is also an instance of a semigroup, we
// can use the infix `|+|` operator for combining `LCDDigit` values:

import cats.implicits._

val ten = one |+| zero

println(ten.show)
  // ... ._.
  // ..| |.|
  // ..| |_|
```

The way in which `LCDDigit` elements should be combined is fairly obvious; however, suppose we are
required to support different strategies for merging value of a particular data type. For example,
consider the aggregation of companies (each of which have a name and a market value):

```
case class Company(name: String, value: Int)
```

One such aggregation might be to form a new company by concatenatation of their names and summing
their values (a possible effect of a merger); another might be to remove all companies except that
with the greatest value. We can define separate monoidal instances in the `Company` companion object
to represent these two effects:

```
object Company {
  implicit val CompanyMergeMonoid = new Monoid[Company] {
    def empty = Company("", 0)
      def combine(t1: Company, t2: Company) =
      Company(t1.name + t2.name, t1.value + t2.value)
  }

  implicit val EliminateCompetitorsMonoid = new Monoid[Company] {
    def empty = Company("", 0)
      def combine(t1: Company, t2: Company) = Set(t1, t2).maxBy(_.value)
  }
}
```

Because there are now two implicit instances in scope, we need to explicitly pass one when declaring
an aggregation:

```
import Monoid._
import Company._

// Some example data
val c1 = Company("A", 10)
val c2 = Company("B", 20)
val c3 = Company("C", 30)
val c4 = Company("D", 40)

val cs = List(c1, c2, c3, c4)

val res1 = combineAll(cs)(CompanyMergeMonoid)
val res2 = combineAll(cs)(EliminateCompetitorsMonoid)

println(res1)
  // Company(ABCD,100)

println(res2)
  // Company(D,40)
```

The real benefit of using a monoidal approach here is that the aggregations are clearly encapsulated
in the companion object of the domain entity, and the business logic only needs to declare that a
particular aggregation shold be performed, without needing to specify how this should happen. This
natural separation of concerns would not be achieved if we were to define the aggregation in line,
using a fold:

```
val x = cs.foldLeft(Company("", 0))((a,b) => Company(a.name + b.name, a.value + b.value))
```

All code for the examples used in this post is available on
[GitHub](https://github.com/richashworth/worksheets/tree/master/fp-patterns/monoids)
