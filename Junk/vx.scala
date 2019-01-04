def add( a:Int, b:Int) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
}
println("Input First Number")
var a = readInt()
println("Input Second Number")
var b = readInt()

println (add(a, b))