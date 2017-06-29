import $ivy.`org.typelevel::cats:0.9.0`, cats.Show

abstract sealed case class Colour(name: String)

object Colour {
  implicit val ColourShow = Show.show[Colour](_.name)

  object Red extends Colour("Red")
  object Blue extends Colour("Blue")
}
