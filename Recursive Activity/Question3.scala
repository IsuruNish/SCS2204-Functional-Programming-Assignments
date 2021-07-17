object Question3 extends App{

  def sum(x: Int, total: Int = 0): Int = {
    if(x == 0)
      total

    else
      sum(x-1, total+x)
  }

  println(sum(5))
}