import math.sqrt
import math.pow

object CaseClassQuestion extends App{
  val p1= Point(1, 2)
  val p2= Point(-4,5)

  println("Point1 = "+p1)
  println("Point2 = "+p2)

  val p3 = p1 + p2
  println("\nQuestion 1: Adding two points")
  println("Point1 + Point2 = "+p3)

  println("\nQuestion 2: Moving a point")
  println("The new Point after moving Point1 by an x coordinate of 5 and a y coordinate of -2 = "+p1.move(5,-2))
  println("The new Point after moving Point2 by an x coordinate of 1 and a y coordinate of 3 = "+p2.move(1,3))

  println("\nQuestion 3: Distance between two points")
  println("The distance between Point1 and Point2 = "+ p1.distance(p2))

  println("\nQuestion 4: Inverting two points")
  println("After inverting Point1 = "+ p1.invert())
  println("After inverting Point2 = "+ p2.invert())
}

case class Point(var x: Int, var y: Int){

  def + (p:Point): Point = Point(this.x + p.x, this.y + p.y)

  def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

  def distance(p:Point) = sqrt(pow((this.x - p.x),2) + pow((this.y - p.y),2) )

  def invert() = Point(this.y,this.x)
}
