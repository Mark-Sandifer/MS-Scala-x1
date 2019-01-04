def rng(higher:Int, lower:Int):Int = {
    var computerGuess = scala.util.Random
    var computerGuessInt = computerGuess.nextInt(higher - lower)
    return computerGuessInt
}
println(rng(100, 1))

def textgap(){
    println("---")
}
def doorint(){
    textgap
    println("> You see a door before you")
    textgap
}
def p_input(){
    println("> What will you do?")
    textgap
}
def pathing(){
    println("You see a path to the left")
    textgap
    println("You see a path to the right")
}

//Instance 1 begins
var instance1 = 0
var i = 0
var a_find = "open"
var b_find = "door"
var interact1 = 0
var interact2 = 0

while(instance1 == 0){
    doorint
    p_input
    var msg= readLine()
    if (interact2 <= 0 && interact1 <= 0){
        while (i < msg.length()-(a_find.length() -1) ){
            if (msg.substring(i, i + a_find.length()) == a_find){
                interact1 += 1
            }
            i += 1
        }
        i = 0
        while (i < msg.length()-(b_find.length() -1) ){
            if (msg.substring(i, i + b_find.length()) == b_find){
                interact2 += 1
            }
            i += 1
        }
        i = 0
    
    }
    if (interact2 == 1 && interact1 == 1){
        println("You open the door")
        instance1 += 1
    }
    else{
        interact1 = 0
        interact2
     = 0
        println("Nothing happens")
    }
}
//Instance 1 ends

//Insatnce 2 begins
var instance2 = 0
interact1 = 0
interact2 = 0

while(instance2 == 0){
    pathing
    p_input
    var msg= readLine()
    msg match{
    case "Right"|"right" => interact1 += 1
    case "Left"|"left" => interact2 += 2
    case _ => println("Invalid direction")
    }

    if(interact1 == 1){
        println("You start to walk left")

        println("At the end of the hall you see a door and a window")
        p_input
    }
}
