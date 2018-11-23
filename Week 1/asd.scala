def ones(no:Int):String = {
    var words = " "
    no match{
        case 0 => words += " "
        case 1 => words += "one"
        case 2 => words += "two"
        case 3 => words += "three"
        case 4 => words += "four"
        case 5 => words += "five"
        case 6 => words += "six"
        case 7 => words += "seven"
        case 8 => words += "eight"
        case 9 => words += "nine"
        case 10 => words += "ten"
        case 11 => words += "eleven"
        case 12 => words += "twelve"
        case 13 => words += "thirteen"
        case 14 => words += "fourteen"
        case 15 => words += "fifteen"
        case 16 => words += "sixteen"
        case 17 => words += "seventeen"
        case 18 => words += "eighteen"
        case 19 => words += "ninteen"
    }
return words
}
def tens(no:Int):String = {
    var words = " "
    no match{
        case 20 => words += "twenty"
        case 30 => words += "thirty"
        case 40 => words += "fourty"
        case 50 => words += "fifty"
        case 60 => words += "sixty"
        case 70 => words += "seventy"
        case 80 => words += "eighty"
        case 90 => words += "ninty"
    }
return words
}

var num = 0
var answer = " "


for(num <- 1 to 95){
    if (num >= 20){
        answer += tens(num/10 * 10) + ones(num%10)
    }

    if (num <= 19){
        answer += ones(num)
    }
    println(answer)
    answer = " "
}
