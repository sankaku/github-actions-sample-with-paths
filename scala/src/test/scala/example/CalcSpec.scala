package example

import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CalcSpec extends AnyWordSpec with Matchers {

  class CalcForTest extends Calc

  val calc = new CalcForTest

  "add" must {
    "return the sum" in {
      val x = 1
      val y = 2

      val actual   = calc.add(x, y)
      val expected = 3

      fail("intentional failure")
      // actual mustBe expected
    }
  }
}
