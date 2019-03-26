import $ivy.`org.typelevel::cats:0.9.0`, cats.{Monoid, Show}

case class LCDDisplay(firstRow: String, secondRow: String, thirdRow: String)

object LCDDisplay {
  implicit val ShowInstance = Show.show[LCDDisplay](_.productIterator mkString "\n")

  implicit val ConcatMonoid = new Monoid[LCDDisplay] {
    override def empty = LCDDisplay("", "", "")
    override def combine(l1: LCDDisplay, l2: LCDDisplay): LCDDisplay =
      LCDDisplay(
        l1.firstRow  + " " + l2.firstRow,
        l1.secondRow + " " + l2.secondRow,
        l1.thirdRow  + " " + l2.thirdRow)
  }

  def parse(s: String): Seq[LCDDisplay] = s.map(i => digitMapping(i.asDigit))
  def display(s: String) = ShowInstance.show(ConcatMonoid.combineAll(parse(s)))

  val digitMapping = Map(
    0 -> LCDDisplay(
      "._.",
      "|.|",
      "|_|"
    ),
    1 -> LCDDisplay("...", "..|", "..|"),
    2 -> LCDDisplay("._.", "._|", "|_."),
    3 -> LCDDisplay("._.", "._|", "._|"),
    4 -> LCDDisplay("...", "|_|", "..|"),
    5 -> LCDDisplay("._.", "|_.", "._|"),
    6 -> LCDDisplay("._.", "|_.", "|_|"),
    7 -> LCDDisplay("._.", "..|", "..|"),
    8 -> LCDDisplay("._.", "|_|", "|_|"),
    9 -> LCDDisplay("._.", "|_|", "..|")
  )
}

import LCDDisplay._

println(display("012345"))
println(display(""))
