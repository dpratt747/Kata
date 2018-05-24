package week1

import week2.LargestProductInSeries

object Main extends App {
//  val wilfredOwen = "What passing-bells for these who die as cattle? – Only the monstrous anger of the guns. Only the stuttering rifles’ rapid rattle Can patter out their hasty orisons. No mockeries now for them; no prayers nor bells; Nor any voice of mourning save the choirs, – The shrill, demented choirs of wailing shells; And bugles calling for them from sad shires. What candles may be held to speed them all? Not in the hands of boys but in their eyes Shall shine the holy glimmers of goodbyes. The pallor of girls’ brows shall be their pall; Their flowers the tenderness of patient minds, And each slow dusk a drawing-down of blinds."
//  val wc = new WordCount(wilfredOwen)
////  wc.getCount.foreach(println)
//  println(wc.getMostFrequent)

//  val euler1 = new MultiplesOf3Or5(1000)
//  println(euler1.result)

//  val sm = new SmallestMultiple
//  sm.res

//  val tf = new PrimeNumbersTillNth
//  println(tf.primeTillNth(6))

//  val f = new Fib
//  println(f.sumUnderLimit(90))

    val prod = new LargestProductInSeries(4)
    println(prod.result)
}
