object Question5 extends App{

  def addEvenNumbers(x: Int, counter: Int = 2, sum: Int = 0): AnyVal ={
    if(x <= 2)
      0

    else if(x == counter)
      sum

    else if(counter%2 == 0)
      addEvenNumbers(x, counter+1, sum+counter)

    else
      addEvenNumbers(x, counter+1, sum)
  }

  print(addEvenNumbers(6))
}