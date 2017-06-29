import $file.Colour, Colour.Colour
import $ivy.`org.typelevel::cats:0.9.0`, cats.Show

import Colour._

val r = implicitly[Show[Colour]].show(Red)
val b = implicitly[Show[Colour]].show(Blue)

println(r)
println(b)
