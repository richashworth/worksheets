trait MakesNoise { def sounds: String }

object Dog extends MakesNoise {
  override def sounds = ("bark")
}
object Laptop extends MakesNoise {
  override def sounds = "whirr, beep"
}

println(Dog.sounds)
println(Laptop.sounds)

// We are combining things that aren't really related in our object hierarchy, just because we want
// to implement the same type of behaviour in them

