object Question1 extends App{
  print("Positive rational number: ")
  var x = new RationalNumber(5,9)
  println(x)

  print("Negative rational number: ")
  var y  = x.neg()
  print(y)
}

class RationalNumber(x:Int, y:Int){
  require(y > 0 , "The denominator should be positive")

  def this(x:Int) = this(x,1)

  private def gcd(num: Int, denum: Int): Int = if (denum == 0) num else gcd(denum, num % denum)

  def numerator:Int = x / gcd(Math.abs(x), y)
  def denominator:Int = y / gcd(Math.abs(x), y)

  def neg():RationalNumber = new RationalNumber(-this.numerator,this.denominator)

  override def toString: String = numerator  + "/" + denominator
}