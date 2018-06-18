package week2

class RunLengthEncoding {

  /**
    *   run length encoding data compression - form of lossless data compression
    *
     */

  // sequence of data of the same value type are stroed in a single data value and count, rather than the original sequence
  //


  def toEncode[A](xs: List[A]): List[(Int, A)] = xs match {
    case Nil => Nil
    case a :: tail => toEncode(tail) match {
      case (c, `a`) :: rest => (c + 1, a) :: rest
      case rest => (1, a) :: rest
    }
  }

//    List((4, 'a'),(1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
  def toDecode[A](input: List[(Int, A)]): List[Char] = {
    input.flatMap{case(n, c) => (c.toString * n).toCharArray}
  }

}
