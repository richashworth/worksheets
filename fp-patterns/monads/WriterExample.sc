import $ivy.`org.typelevel::cats:0.9.0`

import cats.data.Writer
import cats.instances.vector._
import cats.syntax.writer._

val x = Writer(Vector("msg1"), 3)
val y = Writer(Vector("msg2"), 4)

val z = for {
    a <- x
    b <- y
  } yield b

println(z)
