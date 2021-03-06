import $ivy.`org.typelevel::cats:0.9.0`

import cats.data.Reader

case class Db(
  usernames: Map[Int, String],
  passwords: Map[String, String]
)

type DbReader[A] = Reader[Db, A]

def findUsername(userId: Int): DbReader[Option[String]] =
  Reader(db => db.usernames.get(userId))

def checkPassword(
  username: String,
  password: String): DbReader[Boolean] =
    Reader(db => db.passwords.get(username).contains(password))

import cats.syntax.applicative._

def checkLogin(
  userId: Int,
  password: String): DbReader[Boolean] = 
    for {
      username <- findUsername(userId)
      isValid <- username.map(x => checkPassword(x,password)).getOrElse(false.pure[DbReader])
    }yield isValid


val users = Map(
  1 -> "dade",
  2 -> "kate",
  3 -> "margo"
)

val passwords = Map(
  "dade"  -> "zerocool",
  "kate"  -> "acidburn",
  "margo" -> "secret"
)

val db = Db(users, passwords)

// println(checkLogin(1, "zerocool").run(db))
// res10: cats.Id[Boolean] = true

// println(checkLogin(4, "davinci").run(db))
// res11: cats.Id[Boolean] = false

// My own example follows:

case class Config(name: String, age: Int)

type ConfigReader[A] = Reader[Config, A]

def formatName(salutation: String): ConfigReader[String] = Reader(cfg => s"$salutation ${cfg.name}")
def validAge: ConfigReader[Int] = Reader(cfg => math.abs(cfg.age))

def greeting: ConfigReader[String] = for {
  n <- formatName("Mr")
  a <- validAge
  p <- (if(a < 18) "a child" else "an adult").pure[ConfigReader]
} yield s"Hi, $n; you are $p."

val myCfg = Config("Holmes", -37)
println(greeting.run(myCfg))
