object Question1 extends App{

  def prime(x: Int, n: Int = 2):Boolean = {
    if(x <= 1)
      false

    else if(x == 2 || x == n)
      true

    else if(x%n == 0)
      false

    else
      prime(x,n+1)
  }

  println(prime(5))
  println(prime(8))
}