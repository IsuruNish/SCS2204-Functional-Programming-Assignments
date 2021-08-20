object Question2 extends App{
  var x = new RationalNumber(3,4)
  var y = new RationalNumber(5,8)
  var z = new RationalNumber(2,7)

  var output = x-y-z
  print(output)
}

class RationalNumber(var x:Int, var y:Int){
  require(y > 0 , "The denominator should be positive")

  def this(x:Int) = this(x,1)

  private def gcd(num: Int, denum: Int): Int = if (denum == 0) num else gcd(denum, num % denum)

  def numerator:Int = x / gcd(Math.abs(x), y)
  def denominator:Int = y / gcd(Math.abs(x), y)

  def - (a: RationalNumber): RationalNumber = new RationalNumber(this.numerator * a.denominator - this.denominator * a.numerator, this.denominator * a.denominator)

  override def toString: String = numerator  + "/" + denominator
}