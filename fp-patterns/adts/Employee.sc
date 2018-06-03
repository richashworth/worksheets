sealed trait Language
final case object Java   extends Language
final case object Python extends Language
final case object Scala  extends Language


sealed trait Employee
final case class Manager(who: Identity, reports: Set[Employee]) extends Employee
final case class Developer(who: Identity, primarySkill: Language) extends Employee
final case class Tester(who: Identity) extends Employee

case class Identity(name: String, address: Address)
case class Address(line1: String, line2: String, postcode: String)

val a = Address("10", "Main St", "NW1 6XE")
val rich0 = Developer(Identity("Rich", a), Java)

// Easy enough to use copy for changing shallow values
val rich1 = rich0.copy(primarySkill = Scala)

// Less readable for values that are deeply nested:
val rich2 = rich1.copy(
              who = rich1.who.copy(
                  address = rich1.who.address.copy(
                    line1 = "11")))

// We want to be able to manipulate nested properties, while preserving immutability

// Group of patterns known as Optics solve this problem

// We can write a simple lens to solve this:
case class Lens[O, V] ( // O = from object; V = value being accessed or mutated
  get: O => V,
  set: (O, V) => O
)

// We can compose different Lenses to implement getters and setters for neseted state 
def compose[O, I, V](firstLens:  Lens[O, I],  secondLens: Lens[I, V]) = Lens[O, V](
    get = firstLens.get andThen secondLens.get,
    set = (obj, value) => firstLens.set(obj, secondLens.set(firstLens.get(obj), value))
)

val developerIdentityLens= Lens[Developer, Identity](
  get = _.who,
  set = (o, v) => o.copy(who = v)
)
val identityAddressLens = Lens[Identity, Address](
  get = _.address,
  set = (o, v) => o.copy(address = v)
)
val addressLine1Lens= Lens[Address, String](
  get = _.line1,
  set = (o, v) => o.copy(line1 = v)
)

val developerAddressLens = compose(developerIdentityLens, identityAddressLens)
val developerLine1Lens = compose(developerAddressLens, addressLine1Lens)


println(rich0.who.address.line1)
println(developerLine1Lens.get(rich0))
println(developerLine1Lens.set(rich0,"13"))


val firstLine = developerLine1Lens.get(rich0) // 10
val rich = developerLine1Lens.set(rich0, "11")
// Developer(Identity(Rich,Address(11,Main St,NW1 6XE)),Scala)

println(firstLine)
println(rich)
