import $ivy.`org.typelevel::cats:0.9.0`, cats.Monoid

// Our domain entity
case class Company(name: String, value: Int)

// Monoids describe an aggregation pattern.
// We provide two such context-specific aggregations below:

object Company {
  implicit val CompanyMergeMonoid = new Monoid[Company] {
    def empty = Company("", 0)
    def combine(t1: Company, t2: Company) =
      Company(t1.name + t2.name, t1.value + t2.value)
  }

  implicit val EliminateCompetitorsMonoid = new Monoid[Company] {
    def empty = Company("", 0)
    def combine(t1: Company, t2: Company) = Set(t1, t2).maxBy(_.value)
  }
}

import Monoid._
import Company._

// Some example data
val c1 = Company("A", 10)
val c2 = Company("B", 20)
val c3 = Company("C", 30)
val c4 = Company("D", 40)

val cs = List(c1, c2, c3, c4)

// Need to explicitly pass the monoid instance if there is more than one in scope
val res1 = combineAll(cs)(CompanyMergeMonoid)
val res2 = combineAll(cs)(EliminateCompetitorsMonoid)
val res3 = combineAll(List())(EliminateCompetitorsMonoid)

println(res1)
// Company(ABCD,100)

println(res2)
// Company(D,40)

println(res3)
// Company(,0)

// Couldn't we have just used a fold instead?
// -- The benefit of defining a separate monoid instance is that we have abstracted the
//    mechanics of the aggregation from business logic
val x = cs.foldLeft(Company("", 0))((a,b) => Company(a.name + b.name, a.value + b.value))

println(x)
// Company(ABCD,100)
