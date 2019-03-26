package example

import cats.data.Writer
import cats.instances.vector._
import cats.syntax.writer._
import cats.syntax.applicative._

object WriterExample extends App {

  def slowly[A](body: => A) =
    try body
    finally Thread.sleep(100)

  def factorial(n: Int): Int = {
    val ans = slowly {
      if (n == 0) 1 else n * factorial(n - 1)
    }
    println(s"fact $n $ans")
    ans
  }

  // println(factorial(5))
  // fact 0 1
  // fact 1 1
  // fact 2 2
  // fact 3 6
  // fact 4 24
  // fact 5 120
  // 120

  // This will result in interleaved messages in a multithreaded context:

  import scala.concurrent._
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.duration._

  // Await.result(Future.sequence(
  //                Vector(
  //                  Future(factorial(3)),
  //                  Future(factorial(3))
  //                )),
  //              5.seconds)
  // fact 0 1
  // fact 0 1
  // fact 1 1
  // fact 1 1
  // fact 2 2
  // fact 2 2
  // fact 3 6
  // fact 3 6

  // We can use a Writer Monad to ensure the two threads do not interleave log messages by
  // accumulating the log as the calculation is performed, and then printing the log in one atomic
  // operation:

  type Logged[A] = Writer[Vector[String], A]

  def factorial2(n: Int): Logged[Int] = {
    val ans = slowly {
      if (n == 0) 1
      else (n * factorial2(n - 1))
    }.writer(Vector(s"fact $n \n"))
    // println(s"fact $n $ans")
    ans
  }

  Await.result(Future.sequence(
                 Vector(
                   Future(factorial2(3)),
                   Future(factorial2(3))
                 )),
               5.seconds)

}
