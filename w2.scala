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

var a = 0
var b = 0
var i = 0

while (i < marks.length){
    if(marks(i) > a){
        a = marks(i)
        println(marks(i))
    }
    else if(marks(i) > b && marks(i) < a){
        b = marks(i)
    }
i += 1
    if(i == marks.length){
    
}

println(regno(i), name(i), marks(i))