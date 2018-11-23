var x = Array(2, 4)


try {
    var a = 4
    var b = 0
    var c = x(3) / 0
    println("The Result")
    println("Of Division")
    println("is: " + x)
}

catch{
    case a:ArithmeticException => {
        println("You suck")
    }
    case b:ArrayIndexOutOfBoundsException => {
        println("You double suck")
    }
}
