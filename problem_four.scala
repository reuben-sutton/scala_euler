object ProblemFour extends App {
  var combinations = List[(Int, Int)]()
  for(x <- 100 to 999){
    for(y <- x to 999){
      combinations ::= (x, y)
    }
  }
  println((combinations map(x => x._1 * x._2) filter (x => x.toString.reverse == x.toString)).sorted.last)
}