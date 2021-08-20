object Question4 extends App {
  val Bank = List(
    new Account("991411036V", 111, 1000),
    new Account("981511045V", 222, 2000),
    new Account("951411054V", 333, 3000),
    new Account("921411074V", 444, -10),
    new Account("911411542V", 555, 5000),
    new Account("901411369V", 666, 6000),
    new Account("931411896V", 777, -1000),
    new Account("941411516V", 888, 8000),
    new Account("961411846V", 999, 9000),
    new Account("971411876V", 1000, -2500)
  )

  //Question 4.1
  val negBalanceAccounts = Bank.filter((account) => account.balance < 0)
  println("Accounts with negative balances")
  for (i <- negBalanceAccounts) {
    println(i)
  }

  //Question 4.2
  val sumOfBalance = Bank.map((x: Account) => x.balance).reduce((balance1, balance2) => balance1 + balance2)
  println("\nSum of all account balances: " + sumOfBalance)


  //Question 4.3
  def finalBalance(l: List[Account]) {
    for (account <- l) {
      if (account.balance > 0) account.balance = account.balance + account.balance * 1.05
      else if (account.balance < 0) account.balance = account.balance + account.balance * 1.1
    }
  }

  println("\nFinal balances of all accounts after applying the interest function")
  finalBalance(Bank)
  for (i <- Bank) {
    println(i)
  }
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