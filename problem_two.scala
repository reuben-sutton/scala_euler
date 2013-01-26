object ProblemTwo extends App {
  def next_fib(a: Int, b: Int) = Pair(b, a + b)
  var a = 1;
  var b = 2;
  var sum = 0;
  while(a < 4000000){
    if(a % 2 == 0) sum += a
    val Pair(c,d) = next_fib(a,b)
    a = c
    b = d
  }
  println(sum)
}