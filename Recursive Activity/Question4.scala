object Question4 extends App{

  def isEven(x: Int): Boolean = x match {
    case 0 => true
    case _ => isOdd(x-1)
  }

  def isOdd(x: Int): Boolean = !isEven(x)

  println(isEven(5))
  println(isOdd(5))
}