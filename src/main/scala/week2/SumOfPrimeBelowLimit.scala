package week2

class SumOfPrimeBelowLimit(limit: Int) {
  /**
    *A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
    * a2 + b2 = c2
    * For example, 32 + 42 = 9 + 16 = 25 = 52.
    * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    * Find the product abc.
    */

  private val isPrime = (i: Int) => (i > 1) && !(2 to scala.math.sqrt(i).toInt).exists(x => i % x == 0)
  private lazy val range = 2 #:: Stream.from(3).filter(isPrime).takeWhile(_ < limit)
  val result: Long = range.foldLeft(0l)(_ + _)

}
