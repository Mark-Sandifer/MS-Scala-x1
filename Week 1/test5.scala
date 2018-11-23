var number = readInt()
var words = " "
//
(number / 1000) match{
    case 1 => words += "one"
    case 2 => words += "two"
    case 3 => words += "three"
    case 4 => words += "four"
    case 5 => words += "five"
    case 6 => words += "six"
    case 7 => words += "seven"
    case 8 => words += "eight"
    case 9 => words += "nine"
}
if ((number / 1000) > 0){
        words += " thousand "
}
//
number = number%1000
(number / 100) match{
    case 1 => words += "one"
    case 2 => words += "two"
    case 3 => words += "three"
    case 4 => words += "four"
    case 5 => words += "five"
    case 6 => words += "six"
    case 7 => words += "seven"
    case 8 => words += "eight"
    case 9 => words += "nine"
}
if ((number / 100) > 0) {
        words += " hundred "
}
//
number = number%100
(number / 10)
if (number > 10 && number < 20){
    number match{
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
}
//
number = number%100
(number / 10) 
if(number == 10 || number >= 20){
    number match{
    case 10 => words += "ten"
    case 20 => words += "twenty"
    case 30 => words += "thirty"
    case 40 => words += "fourty"
    case 50 => words += "fifty"
    case 60 => words += "sixty"
    case 70 => words += "seventy"
    case 80 => words += "eighty"
    case 90 => words += "ninty"
}
}

println(words)