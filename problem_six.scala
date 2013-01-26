object ProblemSix extends App {
  println((((1 to 100) sum) * ((1 to 100) sum)) - ((1 to 100) map (x => x*x) sum))
}