import $ivy.`org.typelevel::cats:0.9.0`, cats.{Monoid, Show}

case class LCDDigit(firstRow: String, secondRow: String, thirdRow: String)

object LCDDigit{
  implicit val LCDDigitShow = Show.show[LCDDigit](_.productIterator mkString "\n")

  implicit val ConcatLCDigitMonoid = new Monoid[LCDDigit]{
    override def empty = LCDDigit.zero
    override def combine(l1: LCDDigit, l2: LCDDigit): LCDDigit =
      LCDDigit(l1.firstRow  + " " + l2.firstRow,
               l1.secondRow + " " + l2.secondRow,
               l1.thirdRow  + " " + l2.thirdRow)
  }

  implicit class LCDDigitExtensions(l1: LCDDigit){
    def show = LCDDigitShow.show(l1)
    def merge(l2: LCDDigit) = ConcatLCDigitMonoid.combine(l1, l2)
  }

  object zero extends LCDDigit(
    "._.",
    "|.|",
    "|_|"
  )
  object one   extends LCDDigit("...", "..|", "..|")
  object two   extends LCDDigit("._.", "._|", "|_.")
  object three extends LCDDigit("._.", "._|", "._|")
  object four  extends LCDDigit("...", "|_|", "..|")
  object five  extends LCDDigit("._.", "|_.", "._|")
  object six   extends LCDDigit("._.", "|_.", "|_|")
  object seven extends LCDDigit("._.", "..|", "..|")
  object eight extends LCDDigit("._.", "|_|", "|_|")
  object nine  extends LCDDigit("._.", "|_|", "..|")
}

import LCDDigit._

val monoidInstance = implicitly[Monoid[LCDDigit]]

val fiveFourSix = Seq(five, four, six)
val digit = monoidInstance.combineAll(fiveFourSix)

println(digit.show)
  // ._. ._. ... ._.
  // |.| |_. |_| |_.
  // |_| ._| ..| |_|
