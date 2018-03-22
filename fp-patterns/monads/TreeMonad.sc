import $ivy.`org.typelevel::cats:0.9.0`

object Hi {

sealed trait Tree[+A]

final case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]
final case class Leaf[A](value: A) extends Tree[A]

def branch[A](left: Tree[A], right: Tree[A]): Tree[A] = Branch(left, right)
def leaf[A](value: A): Tree[A] = Leaf(value)

import cats.Monad
implicit val treeMonad = new Monad[Tree] {

  def pure[A](x:A): Tree[A] = leaf(x)

  def flatMap[A, B](fa: Tree[A])(f: A => Tree[B]): Tree[B] = fa match {
    case Leaf(a) => f(a)
    case Branch(l,r) => branch(flatMap(l)(f), flatMap(r)(f))
  }
  def tailRecM[A, B](arg: A)(func: A => Tree[Either[A, B]]): Tree[B] =
    func(arg) match {
      case Branch(l, r) =>
        Branch(
          flatMap(l) {
            case Left(l)  => tailRecM(l)(func)
            case Right(l) => pure(l)
          },
          flatMap(r) {
            case Left(r)  => tailRecM(r)(func)
            case Right(r) => pure(r)
          }
          )
        case Leaf(Left(value)) => tailRecM(value)(func)
        case Leaf(Right(value)) => Leaf(value) 
    }
}

val myTree = leaf(3)
val anotherTree= leaf(2)

val biggerTree = branch(myTree, anotherTree)

println(treeMonad.map(myTree)(x => x+4))
println(treeMonad.pure("Richard"))

val hi = for {
  x <- treeMonad(myTree)
  y <- biggerTree
} yield branch(x,y)
