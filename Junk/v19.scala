def highfunc(func:(Int, Int)=>Unit) = {
    func(2,5)
}

def add( a:Int, b:Int ) {
    var result = a + b
    println("result: " + (a + b))
}

def sub( a:Int, b:Int ) {
    var result = a - b
    println("result: " + (a - b))
}

add(2, 6)
sub(5, 2)

highfunc(add)

highfunc(sub)