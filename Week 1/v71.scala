println("Input bill cost")
val bill =readInt()
println("Input payment amount")
val paid =readInt()
var balance = paid - bill
println("Total balance is: " + balance)
//
var fifty = 0
var twenty = 0
var ten = 0
var five = 0
var two = 0
var one = 0
//

if(balance >= 50){
    fifty = balance/50
    balance = balance - (fifty*50)
    println(fifty)
}
if(balance >= 20){
    twenty = balance/20
    balance = balance - (twenty*20)
    println(twenty)
}
if(balance >= 10){
    ten = balance/10
    balance = balance - (ten*10)
    println(ten)
}
if(balance >= 5){
    five = balance/5
    balance = balance - (five*5)
    println(five)
}
if(balance >= 2){
    two = balance/2
    balance = balance - (two*2)
    println(two)
}
//
one = balance
//
if (fifty >= 1) {
    println("Fifty: " + fifty)
}
if (twenty >= 1) {
    println("twenty: " + twenty)
}
if (ten >= 1) {
    println("ten: " + ten)
}
if (five >= 1) {
    println("five: " + five)
}
if (two >= 1) {
    println("two: " + two)
}
if (one >= 1) {
    println("one: " + one)
}