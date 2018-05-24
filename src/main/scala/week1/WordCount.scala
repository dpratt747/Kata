package week1

class WordCount(str: String) {
  private val words = str.split("\\W+").toList.filterNot(_.forall(_.isDigit))
  private val countedMap: Map[String, Int] = words.groupBy(identity).map(tup => (tup._1, tup._2.length))
  def getCountMap: Map[String, Int] = countedMap
  def getMostFrequent: (String, Int) = countedMap.toVector.maxBy(_._2)
}
