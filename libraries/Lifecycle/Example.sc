import $ivy.`com.itv::lifecycle:0.17`

import com.itv.lifecycle._


//Person is an example of a resource that needs to be initialised (by saying 'hello') and requires
//tear-down (by saying 'goodbye':

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


//Example usage (without Lifecycle):

val bob = Person("Bob", secret="Bob's secret")
println(bob)

val fred = Person("Fred", secret="Fred's secret")
println(fred)

val tom = Person("Tom", secret="Tom's secret")
println(tom)

// println(bob.revealSecret) // throws an IllegalArgumentException
bob.hello // "Said hello to Bob"
println(bob.revealSecret) // "Bob's secret"
bob.goodbye// "Said goodbye to Bob"
// bob.revealSecret // throws an IllegalArgumentException


// Rather than having to remember to use a Person resource in this manner, we can define a lifecycle
// interaction that will handle the setup and tear-down (even when exceptions are thrown):
