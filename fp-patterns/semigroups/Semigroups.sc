import $ivy.`org.typelevel::cats:0.9.0`, cats.Semigroup

// Our domain entity
case class Company(name: String, value: Int)

// Some example data
val c1 = Company("A", 10)
val c2 = Company("B", 20)
val c3 = Company("C", 30)
val c4 = Company("D", 40)

val cs = List(c1, c2, c3, c4)

// Semigroups describe an aggregation pattern.
// We provide two such context-specific aggregations below:

implicit val CompanyMergeSemigroup = new Semigroup[Company] {
  def combine(t1: Company, t2: Company) =
    Company(t1.name + t2.name, t1.value + t2.value)
}

implicit val EliminateCompetitorsSemigroup = new Semigroup[Company] {
  def combine(t1: Company, t2: Company) = Set(t1, t2).maxBy(_.value)
}

import Semigroup._

// Need to explicitly pass the monoid instance if there is more than one in scope
val r1 = combineAllOption(cs)(CompanyMergeSemigroup)
val r2 = combineAllOption(cs)(EliminateCompetitorsSemigroup)
val r3 = combineAllOption(List())(EliminateCompetitorsSemigroup)

println(r1)
// Some(Company(ABCD,100))

println(r2)
// Some(Company(D,40))

println(r3)
// None

import cats.implicits._

println(Semigroup[Int => Int].combine(_ + 1, _ * 10).apply(6))
// 67
