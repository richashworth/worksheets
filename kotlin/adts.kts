// Sum Type
sealed class Language {
  object Java: Language()
  object Kotlin: Language()
  object Python: Language()
}

// Product Types
data class Person(val name: String, val address: Address)
data class Address(
    val firstLine: String,
    val secondLine: String?,
    val postcode: String
)

// Sum and Product Type
sealed class Employee {
  data class Manager(val who: Person, val reports: Set<Employee>) : Employee()
  data class Developer(val who: Person, val primarySkill: Language) : Employee()
  data class Tester(val who: Person) : Employee()
}

val ra  = Person("Richard", Address("200 Grays Inn Road", "London", "WC1X 8XY"))
val dev = Employee.Developer(ra, Language.Java)

println(dev.who.address.postcode)

val dev2 = dev.copy(primarySkill = Language.Kotlin)
println(dev2.primarySkill)
println(dev.primarySkill)

// Postcode needs to be corrected... 😞
val dev3 = dev2.copy(
    who = dev2.who.copy(
        address = dev2.who.address.copy(
            postcode = "WC1X 8XZ"
        )
    )
)
println(dev3.who.address)
