@file:Include("adts.kts")

// The Show type class
interface Show<T> {
  fun show(a: T): String
}

// An instance of Show for the Developer type
object DeveloperShow: Show<Employee.Developer> {
  override fun show(a: Employee.Developer): String = "${a.who.name}"
}

println(DeveloperShow.show(dev))
