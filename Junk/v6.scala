println("Input Physics Marks")
val phy=readInt()
println("Input Maths Marks")
val mat=readInt()
println("Input Chemisty Marks")
val che=readInt()
var pper=phy*100/150
var cper=che*100/150
var mper=mat*100/150
var total=phy+che+mat
var per=total*100/450
var fails = 0
if ((pper >= 60) && (cper >= 60) && (mper >= 60)) {
    println("total marks:" + total)
    println("percantage:" + per)
}
if (pper < 60) {
    println("You failed Pyhsics")
    fails = fails + 1
}
if (mper < 60) {
    println("You failed Maths")
    fails = fails + 1
}
if (cper < 60) {
    println("You failed Chemistry")
    fails = fails + 1
}
fails match {
    case 1 => println("Retake the exam")
    case 2 => println("Retake the course")
    case 3 => println("Go home")
}