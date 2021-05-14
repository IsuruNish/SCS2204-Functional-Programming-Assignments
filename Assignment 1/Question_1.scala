object Question_1 extends App{
  def convertTemp(temp: Double):Double = temp*1.8 + 32

  print("The Fahrenheit value of Celsius 35 is: "+ convertTemp(35))
}
