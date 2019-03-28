@file:Include("adts.kts")

@file:DependsOn("io.arrow-kt:arrow-optics:0.9.0")
import arrow.optics.*

// Now using the `Lens` type from arrow-optics:

val developerPersonLens: Lens<Employee.Developer, Person> = Lens(
  get = { dev -> dev.who },
  set = { dev, person -> dev.copy(who = person) }
)

val personAddressLens: Lens<Person, Address> = Lens(
  get = { person -> person.address },
  set = { person, a -> person.copy(address = a) }
)

val addressPostcodeLens: Lens<Address, String> = Lens(
  get = { address -> address.postcode },
  set = { address, pc -> address.copy(postcode = pc) }
)

val developerAddressLens = developerPersonLens compose personAddressLens
val developerPostcodeLens = developerAddressLens compose addressPostcodeLens

println(developerPostcodeLens.get(dev))
println(developerPostcodeLens.set(dev, "NEW POSTCODE"))

