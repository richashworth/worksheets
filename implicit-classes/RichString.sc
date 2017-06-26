object implicits {

  implicit class AugmentedString(str: String) {
    def emphasise = str+"!"
  }

  implicit class AugmentedInt(x: Int){
    def isGreaterThan5 = x > 5
  }

}
