import $ivy.`com.github.julien-truffaut::monocle-core:1.4.0`, monocle.Lens
import $ivy.`com.github.julien-truffaut::monocle-macro:1.4.0`, monocle.macros.GenLens

// _.copy fine for simple cases
case class Address(line1: String, line2: String, postcode: String)
val a = Address("221B", "Baker St", "NW1 6XE")

println(a)
println(a.copy(line1 = "221A"))

// Becomes more tedious for nested classes
case class Account(ID: Int, owner: Person)
case class Person(name: String, address: Address)

val p = Person("Sherlock Holmes", a)
val acc1 = Account(1, p)
val acc2 = acc1.copy(
  owner = acc1.owner.copy(
    address = acc1.owner.address.copy(
      line1 = "221A")))

println(acc2)

// Enter Lenses
val owner: Lens[Account, Person]   = GenLens[Account](_.owner)
val address: Lens[Person, Address] = GenLens[Person](_.address)
val line1: Lens[Address, String]   = GenLens[Address](_.line1)

println(owner.get(acc1))
println(line1.set("221A")(a))

// Real power lies in composing lenses
val lens: Lens[Account, String] = owner composeLens address composeLens line1

println(lens.get(acc1))
println(lens.set("221A")(acc1))
