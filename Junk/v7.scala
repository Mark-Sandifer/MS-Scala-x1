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
while(balance >= 50){
    fifty = fifty + 1
    balance = balance - 50
}
while(balance >= 20){
    twenty = twenty + 1
    balance = balance- 20
}
while(balance >= 10){
    ten = ten + 1
    balance = balance - 10
}
while(balance >= 5){
    five = five + 1
    balance = balance - 5
}
while(balance >= 2){
    two = two + 1
    balance = balance - 2
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