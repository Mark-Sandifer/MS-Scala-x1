var phy=90
var che=90
var mat=90
var total=phy+che+mat
var per=total*100/300

if (per >= 60) {
    println("total marks:" + total)
    println("percantage:" + per)
    
    if (per >= 90)
        println("Your grade is A+")

    if (per >= 80 && per < 90)
        println("Your grade is A")

    if (per >= 70 && per < 80)
        println("Your grade is B")

    if (per < 70)
        println("Your grade is C")
}

if (per < 60) {
    println("You have failed the exam")
}