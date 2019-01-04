abstract class bank{
    def showbalance()
    def deposit(a:Int)
    def withdraw(a:Int)
}

class HSBC extends bank{
    override def showbalance() = {
        println("showing balance")
    }
    override def deposit(a:Int) = {
        println(a + "pounds deposited")
    }
    override def withdraw(a:Int) = {
        println(a + "pounds withdrawn")
    }
}
def banking(b:bank) = {
    b.showbalance()
    b.deposit(200)
    b.withdraw(50)
}

var ref = new HSBC()
banking(ref)