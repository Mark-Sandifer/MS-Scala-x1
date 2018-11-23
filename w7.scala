class Boom {
    println("Hello")
    
    def this(a:Int, b:Int, c:Int) = {
        this()
        println("2nd construction")
    }

    def this(a:Int, b:Int) = {
        this()
        println("3rd constrution")
    }
}

var x = new Boom(2,4,2)