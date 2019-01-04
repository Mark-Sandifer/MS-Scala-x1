def rng(higher:Int, lower:Int):Int = {
    var computerGuess = scala.util.Random
    var computerGuessInt = computerGuess.nextInt(higher - lower)
    return computerGuessInt
}

def textgap(){
    println("---")
}

def p_input(){
    println("> What will you do?")
    textgap
}

def pinitiative():Int = {
    return rng(20, 1)
}

def einitiative():Int = {
    return rng(20, 1)
}

//Combat
var choice = 0
var playeri = pinitiative
var enemyi = einitiative
var playerlife = 20
var enemylife = 20
var combat = 1
var pstart = 0
var estart = 0
var pac = 13
var eac = 13
var hit = 0
if(playeri > enemyi){
    println(s"You rolled $playeri where as the enemy rolled $enemyi. You go first.")
}
else{
    println(s"You rolled $playeri where as the enemy rolled $enemyi. The enemy goes first.")
}
while (combat == 1){
    if(playeri > enemyi){
        println("How do you want to act? \n1 - Attack.\n2 - Block.\n3 - Heal.")
        choice = readInt    
        choice match{
            case 1 => println("You attack!")
                if(rng(20, 1) > eac){
                println("Your hit lands!")
                hit = rng(6, 1)
                enemylife = enemylife - hit
                println(s"You hit the enemy for $hit, current enemy life total is $enemylife")
                    if(enemylife <= 0){
                        combat = 0
                    }
        }
        else{
            println("Your hit misses!")
        }
            case 2 => println("You block!")
            case 3 => println("You tend your wounds!")
}
}
    if(rng(20, 1) > pac){
        println("Their hit lands!")
        hit = rng(6, 1)
        playerlife = playerlife - hit
        println(s"The enemy hit you for $hit, your current life total is $playerlife")
            if(playerlife <= 0){
                combat = 0
            }
    }
    else{
        println("Their hit misses!")
    }
    else{
        if(rng(20, 1) > pac){
            println("Their hit lands!")
            hit = rng(6, 1)
            playerlife = playerlife - hit
            println(s"The enemy hit you for $hit, your current life total is $playerlife")
                if(playerlife <= 0){
                    combat = 0
                }
        }
        else{
            println("Their hit misses!")
        }
        if(rng(20, 1) > eac){
            println("Your hit lands!")
            hit = rng(6, 1)
            enemylife = enemylife - hit
            println(s"You hit the enemy for $hit, current enemy life total is $enemylife")
                if(enemylife <= 0){
                    combat = 0
                }
        }
        else{
            println("Your hit misses!")
        }
    }

}

