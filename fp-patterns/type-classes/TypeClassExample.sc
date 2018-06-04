class Dog
class Laptop

trait MakesNoise[T] { def sounds: String }

object MakesNoiseInstances {
  implicit val makeNoiseDog: MakesNoise[Dog] = new MakesNoise[Dog] {
    def sounds = "bark"
  }
  implicit val makeNoiseLaptop: MakesNoise[Laptop] = new MakesNoise[Laptop] {
    def sounds = "whirr, beep"
  }
}

import MakesNoiseInstances._

implicit val makeNoiseDog: MakesNoise[Dog] = new MakesNoise[Dog] {
 def sounds = "growl"
}

val dogBehaviour = implicitly[MakesNoise[Dog]]
val laptopBehaviour = implicitly[MakesNoise[Laptop]]

println(dogBehaviour.sounds)
// bark

println(laptopBehaviour.sounds)
// whirr, beep
