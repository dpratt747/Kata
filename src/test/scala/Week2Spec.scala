import org.scalatest.WordSpec
import week2.LargestProductInSeries

class Week2Spec extends WordSpec {
  "Week2Katas" when {
    "LargestProductInSeries" should {
      "return largest product of 4 in series when passed 4 in constructor" in {
        val testClass = new LargestProductInSeries(4)
        assert(testClass.result.equals(5832l))
      }
      "return largest product of 13 in series when passed 13 in constructor" in {
        val testClass = new LargestProductInSeries(13)
        assert(testClass.result.equals(23514624000l))
      }
    }
  }
}
