Monoids describe an aggregation pattern: whenever we need to combine or merge values of a particular
type, this design pattern helps abstract the mechanics of the aggregation from the program's
business logic. In this post, we will use the 'LCD Digits' kata that we [tackled
previously](http://richashworth.com/2016/01/lcd-digits-with-scala/) as a motivating example. The
goal here is to transform a sequence of input digits into a string resembling their representation
on an LCD display. For example, given the input `0123456789`, the program should produce:

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

Whereas in our previous solution we used higher-order functions to handle the aggreagation of
digits, we will define a monoid instance for our `LCDDigit` type.
