import $ivy.`org.typelevel::cats:0.9.0`

import cats.data.Writer
import cats.instances.vector._
import cats.syntax.writer._

import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object WriterFactorial extends App {

  def slowly[A](body: => A) =
    try body
    finally Thread.sleep(100)

  def factorial(n: Int): Writer[Vector[String], Int] = {
    val ans = slowly(if (n == 0) 1 else n * factorial(n - 1).value)
    // println(s"fact $n $ans")
    ans.writer(Vector(s"fact $n $ans \n"))
  }

  // println(factorial(5))

  Await.result(Future.sequence(
                 Vector(
                   Future(factorial(3).run),
                   Future(factorial(3).run)
                 )),
               5.seconds)

}
