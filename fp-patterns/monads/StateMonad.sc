import $ivy.`org.typelevel::cats:0.9.0`

import cats.data.State

val a = State[Int, String] { state =>
  (state, s"The state is $state")
}

// Get the state and the result:
val (state, result) = a.run(10).value
// state: Int = 10
// result: String = The state is 10

// // Get the state, ignore the result:
val stateOnly = a.runS(10).value
// stateOnly: Int = 10

// Get the result, ignore the state:
val resultOnly = a.runA(10).value
// resultOnly: String = The state is 10

val step1 = State[Int, String] { num =>
  val ans = num + 1
  (ans, s"Result of step1: $ans")
}
// step1: cats.data.State[Int,String] = cats.data.IndexedStateT@376a962c

val step2 = State[Int, String] { num =>
  val ans = num * 2
  (ans, s"Result of step2: $ans")
}
// step2: cats.data.State[Int,String] = cats.data.IndexedStateT@6be37458

val both = for {
  a <- step1
  b <- step2
} yield (a, b)
// both: cats.data.IndexedStateT[cats.Eval,Int,Int,(String, String)] =
//  cats.data.IndexedStateT@250c2c22

val (finalState, finalResult) = both.run(20).value
// finalState: Int = 42
// finalResult: (String, String) = (Result of step1: 21,Result of step2: 42)”

