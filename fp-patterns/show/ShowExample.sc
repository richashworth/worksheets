import $file.Colour, Colour.Colour
import $ivy.`org.typelevel::cats:0.9.0`, cats.Show

import Colour._

val x = implicitly[Show[Colour]].show(Red)

println(x)
