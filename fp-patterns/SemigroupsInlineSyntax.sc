// We can use inline syntax for combine
import cats.implicits._

import $file.Semigroups, Semigroups.Company

val c1 = Company("Market Leader", 1000)
val c2 = Company("Competitor A", 500)
val c3 = Company("Competitor B", 900)

// The implicit monoid instance that is in scope will be used for the aggregation
import Semigroups.EliminateCompetitorsSemigroup
// import Semigroups.CompanyMergeSemigroup

println(c1 |+| c2 |+| c3)
// Company(Market Leader,1000)
