var marks:Array [Int] = new Array [Int] (3)
marks(0) = 96
marks(1) = 87
marks(2) = 80
var regno:Array [Int] = new Array [Int] (3)
regno(0) = 0
regno(1) = 1
regno(2) = 2
var name:Array [String] = new Array [String] (3)
name(0) = "Peter"
name(1) = "Shafeeq"
name(2) = "Alex"

var first = marks(0)
var second = marks(0)
var i = 0

while (i < marks.length){
    if(marks(i) > first){
        second = first
        first = marks(i)
    }
    if(first == second){
        second = marks(i)
    }
i += 1
}

println(first)
println(regno(), name(), marks())