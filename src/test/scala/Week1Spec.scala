import org.scalatest.WordSpec
import week1._

class Week1Spec extends WordSpec {

  "A Week1Katas" when {
    "WordCount class" should {
        val statement = "This is a sentence, that includes punctuation and has a count of 16 words; not including punctuations!"
        val wc = new WordCount(statement)

      "return a count of words inside of a statement" in {
        assert(wc.getCountMap.values.sum.equals(16))
      }
      "return the most commonly occurring word" in {
        assert(wc.getMostFrequent._2.equals(2))
      }
    }
    "PrimeNumbersTillNth class" should {
      val tf = new PrimeNumbersTillNth
      "return the 10001st prime number" in {
         assert(tf.primeTillNth(10001).equals(104743))
      }
      "return the 13th prime number" in {
        assert(tf.primeTillNth(6).equals(13))
      }
    }
    "SmallestMultiple class" should {
      "return the smallest multiple divisible by the numbers one to ten" in {
        val sm = new SmallestMultiple(1 to 10)
        assert(sm.res.equals(2520))
      }
      "return the smallest multiple divisible by the numbers one to twenty" in {
        val sm = new SmallestMultiple(1 to 20)
        assert(sm.res.equals(232792560))
      }
    }
    "MultiplesOf3Or5 class" should {
      "return sum of multiples of 3 or 5 under 10" in {
        val multiples = new MultiplesOf3Or5(10)
        assert(multiples.result.equals(23))
      }
      "return sum of multiples of 3 or 5 under 1000" in {
        val multiples = new MultiplesOf3Or5(1000)
        assert(multiples.result.equals(233168))
      }
    }
    "Fib class" should {
      "return sum of even fib values under limit provided" in {
        val f = new Fib
        assert(f.sumUnderLimit(4000000).equals(4613732))
        assert(f.sumUnderLimit(90).equals(44))
      }
    }
  }


}
