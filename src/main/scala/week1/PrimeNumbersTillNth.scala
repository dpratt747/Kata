package week1

class PrimeNumbersTillNth {

  /**
    * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
      What is the 10001st prime number?
    */

  private val isPrime = (i: Int) => (i > 1) && !(2 to scala.math.sqrt(i).toInt).exists(x => i % x == 0)

  private def untilNth(limit: Int, toCheck: Int = 1, store: List[Int] = List.empty[Int] ): Int = {
    if (store.length.equals(limit)) {
      store.head
    } else {
      if (isPrime(toCheck)) {
        untilNth(limit, toCheck + 1, toCheck :: store)
      } else {
        untilNth(limit, toCheck + 1, store)
      }
    }
  }

  val primeTillNth: Int => Int = (i: Int) => untilNth(i)


}
