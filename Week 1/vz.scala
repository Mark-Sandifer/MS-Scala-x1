var t1 = 2
for(t1 <- 2 to 20){
    var t2 = 1
    println("times table of: " + t1)
    for(t2 <- 1 to 10){
        println(s"$t1 x $t2 = " + t1 * t2)
    }
}
