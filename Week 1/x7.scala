abstract class bank{
    def deposit(a:Int)
    def withdraw(a:Int)
    def balance()
}

class HSBC extends bank{
    override def deposit(a:Int) = {
        println(a + " deposited")
    }
    override def withdraw(a:Int) = {
        println(a + " withdrawn")
    }
    override def balance() = {
        println("amount")
    }
}

var ref = new HSBC()
ref.withdraw(12)

def test(x:bank){
    x.balance()
}

var y = new HSBC()
test(y)