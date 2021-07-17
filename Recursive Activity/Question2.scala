object Question2 extends App{

  def isPrime(x: Int, n: Int = 2):Boolean = {
    if(x <= 1)
      false

    else if(x == 2 || x == n)
      true

    else if(x%n == 0)
      false

    else
      isPrime(x,n+1)
  }

  def primeSeq(x: Int, n: Int = 2): Unit ={
    if(x>1 && x != n){
      if(isPrime(n))
        println(n)

      primeSeq(x, n+1)
    }
  }

  primeSeq(10)
}