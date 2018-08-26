import $ivy.`com.github.julien-truffaut::monocle-core:1.4.0`, monocle.{Lens, Optional}
import $ivy.`com.github.julien-truffaut::monocle-macro:1.4.0`, monocle.macros.GenLens

import $file.Lenses, Lenses.Address

// Change our domain model so that account owners do not need to provide an address
case class Person(name: String, maybeAddress: Option[Address])
case class Account(ID: Int, owner:Person)

// Set up some example data
val a   = Address("221B", "Baker St", "NW1 6XE")
val p1  = Person("John Watson", None)
val p2  = Person("Sherlock Holmes", Some(a))
val acc = Account(1, p1)

// As before, we can define a lens between account and its owner
val owner = GenLens[Account](_.owner)

// Use `Optional` to manipulate fields of type Option[_].
// Takes two functions as arguments: a 'getter' and a 'setter'
val address = Optional[Person, Address](_.maybeAddress)(a => _.copy(maybeAddress = Some(a)))

println(address.getOption(p1))
println(address.getOption(p2))

println(address.set(a)(p1))

// Lenses and Optionals compose
val optional: Optional[Account, Address] = owner composeOptional address
println(optional.getOption(acc))

val updatedAcc = optional.set(a)(acc)
println(updatedAcc)
