package week2

class RunLengthEncoding {

  /**
    *   run length encoding data compression - form of lossless data compression
    *
     */

  // sequence of data of the same value type are stroed in a single data value and count, rather than the original sequence
  //

  private def pack[A] = (input: Seq[A]) =>  input.groupBy(identity).values.toList

  def toEncode[A](xs: List[A]): List[(Int, A)] = xs match {
    case Nil => Nil
    case a :: tail => toEncode(tail) match {
      case (c, `a`) :: rest => (c + 1, a) :: rest
      case rest => (1, a) :: rest
    }
  }

  def toDecode(input: String): Seq[Char] = {
    val a = input.split("[0-9]+")
    val b: Array[Int] = input.split("[A-Z]+|[a-z]+").tail.flatMap(_.map(_.asDigit))
    val duplicate = (a: String, b: Int) =>  a * b
    a.zip(b).flatMap{case(item, count) => duplicate(item,count)}
  }

}
