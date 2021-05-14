import scala.math._

object Question_2 extends App{
  def volume(r:Double):Double = 4f/3 * Pi * pow(r,3)

  print("The volume of a sphere with radius 5 is: "+ volume(5))
}
