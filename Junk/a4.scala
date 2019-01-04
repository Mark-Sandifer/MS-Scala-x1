object bank{
    var dollar = 95
}

class bank{
    var a = 0
    def amount(x:Int) = {
    println("amount: " + (x * bank.dollar))
    }
    def setdollar(x:Int) = {
        bank.dollar = x
    }
}

var hsbc = new bank
var natwest = new bank
var barclays = new bank

hsbc.amount(4)
natwest.amount(2)
barclays.amount(100)