class one{
    var a = 0
    def message() = {
        println("hi")
    }
}

class two extends one{
    def msg() = {
        println("hello")
    }
}

var ref = new two()
ref.msg
ref.message