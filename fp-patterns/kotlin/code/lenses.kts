@file:Include("adts.kts")

interface Lens<T, V> {
  fun get(t: T): V
  fun set(t: T, v: V): T
}

// Simple lenses for our ADT
object developerPersonLens: Lens<Employee.Developer, Person> {
  override fun get(dev: Employee.Developer): Person = dev.who
  override fun set(dev: Employee.Developer, p: Person): Employee.Developer = dev.copy(who = p)
}

object personAddressLens: Lens<Person, Address> {
  override fun get(p: Person): Address = p.address
  override fun set(p: Person, a: Address): Person = p.copy(address = a)
}

object addressPostcodeLens: Lens<Address, String> {
  override fun get(a: Address): String = a.postcode
  override fun set(a: Address, pc: String): Address = a.copy(postcode = pc)
}

// Lenses are made of functions... which compose!
fun <T, V, U> composeLens(l1: Lens<T, V>, l2: Lens<V, U>) = object: Lens<T, U> {
  override fun get(t: T): U = l2.get(l1.get(t))
  override fun set(t: T, u:U): T = l1.set(t, l2.set(l1.get(t), u))
}

// We can now build lenses from other lenses:
val developerAddressLens = composeLens(developerPersonLens, personAddressLens)
val developerPostcodeLens = composeLens(developerAddressLens, addressPostcodeLens)

println(developerPostcodeLens.get(dev))
println(developerPostcodeLens.set(dev, "SW13 8AA"))


