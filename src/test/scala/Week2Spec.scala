import org.scalatest.WordSpec
import week2.{LargestProductInSeries, RunLengthEncoding}

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
    "RunLengthEncoding" should {
      val rlEncode = new RunLengthEncoding
      "complete run length encoding when passed a Seq" in {
        val test = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
        val expectedRes: List[(Int, Char)] = List((4, 'a'),(1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
        assert(rlEncode.toEncode(test).equals(expectedRes))
      }
      "complete run length decoding when passed a Seq of any type" in {
        val testDecode = "e4a6b1c2d1"
        assert(rlEncode.toDecode(testDecode).equals(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
      }
    }
  }
}
