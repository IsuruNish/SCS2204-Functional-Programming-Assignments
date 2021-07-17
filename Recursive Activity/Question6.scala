object Question6 extends App{

  def fibonacci(n: Int): Int = n match{
    case 0 => 0
    case n if n == 1 => 1
    case _ => fibonacci(n-1) + fibonacci(n-2)
  }

  def printFibonacciNumbers(n: Int, x: Int = 0): Unit ={
    if(n>0)
      printFibonacciNumbers(n-1, 1)

    if(x != 0)
      println(fibonacci(n))
  }

  printFibonacciNumbers(5)
}
