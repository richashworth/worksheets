import $ivy.`org.typelevel::cats:0.9.0`

import cats.data.State


def addOne = State[Int, String] { state =>
  val a = state + 1
  (a, s"Result of addOne is $a")
}

// double every other digit starting with check digit (rightmost)

// def doubleEveryOtherDigit = State[Vector[Int], String] {
//   state => 
// }

// val v = List(1,2,3,4,5,6,7)
val v = List(4,9,9,2,7,3,9,8,7,1,6)
println(v.reverse)

val pairs = (v.reverse.grouped(2).toList)

val doubled = (pairs.map(x => x.head*2::x.tail))
println(doubled.flatten)

val sumDigits = (doubled.flatten.map{x => if (x>9) x.toString.map(_.asDigit).sum else x})
println(sumDigits)

val sum = sumDigits.sum

println(sum % 10)





// sum non-check digits

// check if total mod 10 is zero

