data class Person(val name: String, val address: Address)

data class Address(
        val firstLine: String,
        val secondLine: String?,
        val postcode: String
)

fun getGreeting(x: Person): String {
    return "Hello, ${x.name}"
}

val tm = Person("Theresa May",
        Address("10 Downing Street", "London", "SW1A 2AA"))

println(getGreeting(tm))
