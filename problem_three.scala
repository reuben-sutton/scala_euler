object ProblemThree extends App {
  // not my solution, just much more elegant than anything I could think of, so keeping for reference
  lazy val naturals: Stream[Int] = Stream.cons(1, naturals.map(_ + 1))
  var theNum = 600851475143L
  println(naturals.drop(1).dropWhile(n => {
    while(theNum % n == 0) {
      theNum /= n
    }
    theNum > 1
  }))
}