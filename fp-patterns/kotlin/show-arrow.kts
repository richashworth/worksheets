@file:Include("adts.kts")

@file:DependsOn("io.arrow-kt:arrow-core-data:0.9.0")
@file:DependsOn("io.arrow-kt:arrow-core-extensions:0.9.0")

import arrow.*
import arrow.core.extensions.*

// arrow-kt uses extension methods to give convenient syntax for using type classes. It provides
// instances for a number of standard types, e.g. Int:

val one: String = Int.show().run {
  // we have access to the extension methods within this block
  // (similar to implicit scope of typeclass instances in scala)
  1.show()
}

println(one)
// 1

// there is also syntax for defining our own instances of custom types

