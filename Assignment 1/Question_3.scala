object Question_3 extends App{
  def TotalCost(books:Int):Double = {
    if(books>50)
      24.95*0.6*books + 3*50 + (books-50)*0.75
    else
      books*3
  }

  print("The total wholesale cost for 60 copies is: "+ TotalCost(60))
}