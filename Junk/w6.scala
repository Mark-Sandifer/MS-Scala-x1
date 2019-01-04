class Boom{
    var x = 95
    def msg() = {
        var t = 14
        var x = 25
        println(s"T: $t")
        println(s"X: " + this.x)
    }

    def msg2() = {
        println(s"X: $x")
    }
}

var ref = new Boom()
ref.msg()
ref.msg2()
println(ref.x)