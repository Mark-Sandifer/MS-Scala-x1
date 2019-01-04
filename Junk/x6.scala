class math{
    var a = 10
    def addition(a:Int, b:Int)={
        var result = a + b
        println("result: " + (a + b))
    }

    def subtraction(a:Int, b:Int)={
        println(a+b)
    }
}

class math2 extends math{
    def multiplication(a:Int, b:Int) = {
        var result = a * b
        println("result: " + (a * b))
    }
}

class math3 extends math2{
   override def subtraction(a:Int, b:Int) = {
        var result = a - b
        println("result: " + (a - b))
    }
}

var ref = new math3()
