import $ivy.`org.typelevel::cats:0.9.0`

import cats.Show
import cats.instances.all._
import cats.syntax.show._

println(implicitly[Show[Int]].show(42)) // 42
println(42.show) // 42

sealed abstract class Colour(val name: String)
object Colour{ 
  implicit val ColourShow = Show.show[Colour](_.name)
  object Red extends Colour("Red")
  object Blue extends Colour("Blue")
}

implicit class ColourExt(c: Colour){
  def show = Colour.ColourShow.show(c)
}

import Colour._
println(Red.show) // Red
