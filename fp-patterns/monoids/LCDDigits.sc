import $ivy.`org.typelevel::cats:0.9.0`, cats.Monoid

// Our domain entity
case class LCDDigit(line1: String, line2: String, )

// Some example data
val c1 = Company("A", 10)
val c2 = Company("B", 20)
val c3 = Company("C", 30)
val c4 = Company("D", 40)

val cs = List(c1, c2, c3, c4)

// Monoids describe an aggregation pattern.
// We provide two such context-specific aggregations below:

implicit val CompanyMergeMonoid = new Monoid[Company] {
  def empty = Company("", 0)
  def combine(t1: Company, t2: Company) =
    Company(t1.name + t2.name, t1.value + t2.value)
}

implicit val EliminateCompetitorsMonoid = new Monoid[Company] {
  def empty = Company("", 0)
  def combine(t1: Company, t2: Company) = Set(t1, t2).maxBy(_.value)
}

import Monoid._

// Need to explicitly pass the monoid instance if there is more than one in scope
val r1 = combineAll(cs)(CompanyMergeMonoid)
val r2 = combineAll(cs)(EliminateCompetitorsMonoid)
val r3 = combineAll(List())(EliminateCompetitorsMonoid)

println(r1)
// Company(ABCD,100)

println(r2)
// Company(D,40)

println(r3)
// Company(,0)

// Couldn't we have just used a fold instead?
// -- Yes, but the benefit of defining a separate monoid instance is that we have abstracted the
//    mechanics of aggregation from the business logic
val x = cs.foldLeft(Company("", 0))((a,b) => Company(a.name + b.name, a.value + b.value))

println(x)
// Company(ABCD,100)
