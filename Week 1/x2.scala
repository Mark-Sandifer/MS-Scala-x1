class asda{
    var productname = ""
    var quantity = 0
    var price = 0.0
    def amount{
        var productamount = quantity * price
        println(productname)
        println(s"Amount: $productamount")
    }
    def bill{
        var productamount = quantity * price
        var tax = (quantity * price) * 0.15
        var netbill = (productamount + tax)
        println(productname)
        println(s"Quantity: $quantity")
        println(s"Price: $price")
        println(s"Amount: $productamount")
        println(s"Tax: $tax")
        println(s"NetBill: $netbill")
    }
}

var ref = new asda()
    ref.productname = "Pepsi"
    ref.quantity = 15
    ref.price = 1.5
    ref.bill