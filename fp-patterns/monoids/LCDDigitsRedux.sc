import $ivy.`org.typelevel::cats:0.9.0`, cats.{Monoid, Show}

case class LCDDigit(firstRow: String, secondRow: String, thirdRow: String)

object LCDDigit {
  implicit val ShowInstance = Show.show[LCDDigit](_.productIterator mkString "\n")

  implicit val ConcatMonoid = new Monoid[LCDDigit] {
    override def empty = LCDDigit("", "", "")
    override def combine(l1: LCDDigit, l2: LCDDigit): LCDDigit =
      LCDDigit(
        l1.firstRow  + " " + l2.firstRow,
        l1.secondRow + " " + l2.secondRow,
        l1.thirdRow  + " " + l2.thirdRow)
  }

  implicit class Extensions(l1: LCDDigit) {
    def show = ShowInstance.show(l1)
    def merge(l2: LCDDigit) = ConcatMonoid.combine(l1, l2)
  }

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

// Enable the infix |+| semigroup operator for combining monoids (which are SGs)
import cats.implicits._

val ten = one |+| zero

println(ten.show)
  // ... ._.
  // ..| |.|
  // ..| |_|
