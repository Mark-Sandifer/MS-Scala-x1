class Person {
    private var _marks = 0
    var name = " "

 // Getter
    def marks = _marks

 // Setter
    def marks_= (value:Int):Unit = {
        _marks = value
    }
}

var record = new Person
record.marks = 73
record.name = "Ted"
println("Total marks: " + record.marks)
println("Name: " + record.name)