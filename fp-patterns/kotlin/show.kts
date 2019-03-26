@file:Include("adts.kts")

// The Show type class
interface Show<T> {
  fun show(a: T): String
}

// An instance of Show for the Developer type
object ShowDeveloper: Show<Employee.Developer> {
  override fun show(a: Employee.Developer): String = "${a.who.name}"
}

println(ShowDeveloper.show(dev))

