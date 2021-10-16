package example

class Calc {
  def add(
    x: Int,
    y: Int
  ): Int = x + y
}

object Hello extends App {
  val calc   = new Calc
  val answer = calc.add(1, 2)
  println(s"answer = $answer")
}
