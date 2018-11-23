var msg="This is a test"
var i = msg.length() - 1
var word = " "
while (i >= 0 ){
    if (msg.substring(i, i + 1) == " "){
        println(word)
        word = " "
    }
    else{
        word = msg.substring(i, i+1) + word
    }
  i -= 1
}
println(word)