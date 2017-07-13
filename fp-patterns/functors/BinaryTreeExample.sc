import $ivy.`org.typelevel::cats:0.9.0`, cats.Functor

sealed trait Tree[+A]
final case class Leaf[A](value: A) extends Tree[A]
final case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

implicit def treeFunctor = new Functor[Tree] {
  def map[A, B](t: Tree[A])(func: A => B): Tree[B] = t match {
    case Leaf(v)      => Leaf(func(v))
    case Branch(l, r) => Branch(map(l)(func), map(r)(func))
  }
}

val functor = implicitly[Functor[Tree]]

val intTree: Tree[Int] = Leaf(3)
println(functor.map(intTree)(_ + 2))
  // Leaf(5)

val stringTree: Tree[String] =
  Branch(Branch(Leaf("A"), Leaf("B")), Leaf("C"))

println(functor.map(stringTree)(x => s"Node: $x"))
  // Branch(Branch(Leaf(Node: A),Leaf(Node: B)),Leaf(Node: C))

//Can also use functor syntax (`map`)
import cats.syntax.functor._

println(intTree.map(_ * 10))
  // Leaf(30)
