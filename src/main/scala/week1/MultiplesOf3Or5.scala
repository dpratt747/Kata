package week1

class MultiplesOf3Or5(limit: Int){
  /**
    * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
      Find the sum of all the multiples of 3 or 5 below 1000.
    */

  private val range = (1 until limit).toVector

  private val checkMultiples = (i: Int) => if (i % 5 == 0 || i % 3 == 0) true else false

  val result: Int = range.filter(checkMultiples).sum

}
