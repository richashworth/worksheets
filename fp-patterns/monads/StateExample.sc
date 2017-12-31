import $ivy.`org.typelevel::cats:0.9.0`

import cats.data.State

def addOne = State[Int, String] { state =>
  val a = state + 1
  (a, s"Result of addOne is $a")
}

def double = State[Int, String] { state =>
  val a = state * 2
  (a, s"Result of double is $a")
}

def modTen = State[Int, String] { state =>
  val a = state % 10
  (a, s"Result of modTen is $a")
}

def genNumber = for {
  a <- addOne // threads the new state to the next computation
  b <- double // threads the new state to the next computation
  c <- modTen
} yield c


val (state, result) = genNumber.run(3).value

println(state)
println(result)

val resultOnly = genNumber.runA(3)
val stateOnly  = genNumber.runS(3)
