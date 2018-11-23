def rng(higher:Int, lower:Int):Int = {
    var computerGuess = scala.util.Random
    var computerGuessInt = computerGuess.nextInt(higher - lower)
    return computerGuessInt
}
var life = 100
var result = (life - rng(10, 1))
var hit = 0
while(combat == 1){
    if (result % 2 == 0){
        hit = 1
        
    }
    else{
        hit = 0
    }
}

println(s"Remaining life total: $result")

