package week1

import scala.annotation.tailrec

class SmallestMultiple(val inputRange: Range) {
  /**
    * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
      What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    */


  private val range = inputRange.toVector
  private val evenlyDivisibleByAll = (i: Int) => range.map(x => i % x == 0).forall(_ == true)

  @tailrec
  private def checkMultiple(value: Int = 1): Int = {
    if (evenlyDivisibleByAll(value)){
      value
    }
    else{
      checkMultiple(value + 1)
    }
  }

  val res: Int = checkMultiple()

}
