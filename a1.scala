def rng(higher:Int, lower:Int):Int = {
    var computerGuess = scala.util.Random
    var computerGuessInt = computerGuess.nextInt(higher - lower)
    return computerGuessInt
}
var life = 100
var hit = rng(10, 1)
var result = 0
var combat = 1
while(combat == 1){
    if (hit % 2 == 0){
        life = life - hit
        println(s"They hit for $hit damage")
        println(s"Remaining life total: $life")
        
    }
    else{
        println("They miss!")
        println(s"Remaining life total: $life")
    }
    combat -= 1
}


