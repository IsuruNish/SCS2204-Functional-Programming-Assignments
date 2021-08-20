object Question3 extends App{
  val acc1 = new Account("951471025V" , 123, 1000)
  val acc2 = new Account("902451325V" , 456, 2500)

  println("Before transferring money")
  println(acc1)
  println(acc2)

  acc1.transfer(acc2,500)

  println("\nAfter transferring money")
  println(acc1)
  println(acc2)
}

class Account(var nic:String, var accNumber: Int, var balance: Double){

  def withdraw(amount:Double) = this.balance = this.balance - amount

  def deposit(amount:Double) = this.balance = this.balance + amount

  def transfer(acc:Account,amount:Double)= {
    acc.balance = acc.balance + amount
    this.balance = this.balance - amount
  }

  override def toString = (nic+" : "+accNumber +" : "+ balance)
}