class Dog
class Laptop

trait MakesNoise[T] { def sounds: String }

object Instances {
  implicit val makeNoiseDog: MakesNoise[Dog] = new MakesNoise[Dog]{
    def sounds = "bark"
  }
  implicit val makeNoiseLaptop: MakesNoise[Laptop] = new MakesNoise[Laptop]{
    def sounds = "whirr, beep"
  }
}

import Instances._

val dogBehaviour = implicitly[MakesNoise[Dog]]
val laptopBehaviour = implicitly[MakesNoise[Dog]]

println(dogBehaviour.sounds)
println(laptopBehaviour.sounds)
