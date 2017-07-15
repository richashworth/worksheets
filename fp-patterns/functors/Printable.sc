import $ivy.`org.typelevel::cats:0.9.0`, cats.Functor

trait Printable[A] {
  def format(value: A): String

  // As long as we can convert B to A, then B is Printable
  def contramap[B](func: B => A): Printable[B] = {
    val self = this
    new Printable[B] {
      def format(value: B) = self.format(func(value))
    }
  }
}

def format[A](value: A)(implicit p: Printable[A]): String =
  p.format(value)

implicit val stringPrintable =
  new Printable[String] {
    def format(value: String): String =
      "\"" + value + "\""
  }

implicit val booleanPrintable =
  new Printable[Boolean] {
    def format(value: Boolean): String =
      if (value) "yes" else "no"
  }

println(format("hello"))
  // hello

println(format(true))
  // yes

final case class Box[A](value: A)

implicit def boxPrintable[A](implicit p: Printable[A]) =
  p.contramap[Box[A]](_.value)

println(format(Box("Hi")))
  // "Hi"

println(format(Box(true)))
  // yes
