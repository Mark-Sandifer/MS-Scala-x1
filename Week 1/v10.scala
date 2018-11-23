var a = 1
for (a <- 1 to 100){
    if(a !=5){
        print(a)
        if (a > 5){
            println("x")
            if (a % 2 == 0){
                println("even")
            }
            else{
                println("odd")
            }
        }
        else{
            println("y")
        }
    }
    else{
        println("oops")
    }
}