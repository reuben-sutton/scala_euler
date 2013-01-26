object ProblemFive extends App {
  println((20 to Int.MaxValue).find(n => (2 to 20).forall(n % _ == 0)))
}