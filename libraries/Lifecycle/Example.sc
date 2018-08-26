import $ivy.`com.itv::lifecycle:0.17`

import com.itv.lifecycle._

// Person is an example of a resource that needs to be initialised (by saying 'hello') and requires
// tear-down (by saying 'goodbye'):

case class Person(name: String, private val secret: String) {

  private var readyToTellSecret = false

  def hello(): Unit = {
    readyToTellSecret = true
    println("Said hello to " + name)
  }

  def revealSecret(): String = {
    require(readyToTellSecret, s"it's rude to ask $name a secret before you've said hello")
    secret
  }

  def goodbye(): Unit = {
    readyToTellSecret = false
    println("Said goodbye to " + name)
  }
}


// Example usage (without Lifecycle):

val bob = Person("Bob", secret="AAA")
println(bob)

val fred = Person("Fred", secret="AAA")
println(fred)

val tom = Person("Tom", secret="BBB")
println(tom)

// println(bob.revealSecret) // throws an IllegalArgumentException
bob.hello // "Said hello to Bob"
println(bob.revealSecret) // "AAA"
bob.goodbye// "Said goodbye to Bob"
// bob.revealSecret // throws an IllegalArgumentException


// Rather than having to remember to use a Person resource in this manner, we can define a lifecycle
// interaction that will handle the setup and tear-down (even when exceptions are thrown):

import com.itv.lifecycle._

def personInteraction(person: Person): Lifecycle[Person] =
  new VanillaLifecycle[Person] {
    override def start(): Person = {
      person.hello()
      person
    }

    override def shutdown(instance: Person): Unit =
      person.goodbye()
  }


// This interaction can then be used in a lifecycle as follows. We pass in a function to
// Lifecycle.using that will get wrapped with the lifecycle methods defined in the
// personInteraction.

def announceSecret(person: Person) = {
  val secret: String = Lifecycle.using(personInteraction(person)) { greetedPerson =>
    println("Asking secret")
    greetedPerson.revealSecret()
  }

  println(s"${person.name}'s secret is '$secret'")
}

println("---")
announceSecret(bob)
// Said hello to Bob
// Asking secret
// Said goodbye to Bob
// Bob's secret is 'AAA'


// Note that Lifecycle is a monad, so we can compose interactions with guaranteed resource safety.
// Here, interrogation produces a new Lifecycle[T]. T (in this case (String, String) is then the
// parameter type A of the function passed into Lifecycle.using(interrogation)(f: A => B)

def areFriends(personA: Person, personB: Person): Boolean = {
  val interrogation: Lifecycle[(String, String)] = for {
    a <- personInteraction(personA)
    b <- personInteraction(personB)
  }
  yield (a.revealSecret(), b.revealSecret())

  Lifecycle.using(interrogation) { case (secretA, secretB) => secretA == secretB }
}

println("---")
println(areFriends(bob, fred))
// Said hello to Bob
// Said hello to Fred
// Said goodbye to Bob
// Said goodbye to Fred
// true

println(areFriends(bob, tom))
// Said hello to Bob
// Said hello to Fred
// Said goodbye to Bob
// Said goodbye to Fred
// false
