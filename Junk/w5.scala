var test = 0
var first = 13
var second = 11
class Exp1 extends Exception{
    println("> EXCEPTION - Employee has taken six or more days off")
}

if(second > first) {
    var ref = new Exp1
    throw ref
}

class accounts{
    def salarycalc(salary:Int, absents:Int) = {
        if(absents >=6){
            var x = new Exp1()
            throw x
        }
        else{
            println(s"total salary: $salary, total absent days: $absents")
        }
    }
}
var ref = new accounts()
try{
    ref.salarycalc(1535, 7)
}
catch{
    case x:Exp1 => {
        println("what are you doing")
    }
}
