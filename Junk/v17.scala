def tax( salary:Int) : Int = {
    var salary = 2145
    var taxamount : Int = 0
    if (salary < 1000){
        return salary
}
    if (salary < 2000){
        taxamount = 150/100
}
    if (salary < 3000){
        taxamount = 170/100
}
    else{
        taxamount = 210/100
}
    println("Tax" + taxamount)
    println(salary * taxamount)
}