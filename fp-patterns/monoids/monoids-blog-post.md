Monoids describe an aggregation pattern: whenever we need to combine or merge values of a particular
type, a monoid instance can be used to abstract the mechanics of the aggregation from the program's
business logic.  In this post, we will use the 'LCD Digits' kata that we [tackled
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

Whereas in our previous solution we used higher-order functions to handle the aggregation of
digits, in this case we will define a monoid instance for our `LCDDigit` type. A monoid is
essentially a _semigroup_, i.e. a set with some associative operation `combine` defined on it that
also has some identity element _id_ for which the following must be true: For all elements _s_ from
the underlying set _S_, combine(s, id) = combine(id, s) = s. In practice these algebraic laws enable
us to combine elements from a (possibly empty) collection.

For our `LCDDigit` type, the following monoid instance is used to specify how two `LCDDigit` values
should be combined, and what value should be used as the identity element. We add this to our
companion object so that it is added to the implicit scope whenever the type is imported.

```
implicit val ConcatMonoid = new Monoid[LCDDigit] {
  override def empty = LCDDigit("", "", "")
  override def combine(l1: LCDDigit, l2: LCDDigit): LCDDigit =
      LCDDigit(
          l1.firstRow  + " " + l2.firstRow,
          l1.secondRow + " " + l2.secondRow,
          l1.thirdRow  + " " + l2.thirdRow)
}
```
