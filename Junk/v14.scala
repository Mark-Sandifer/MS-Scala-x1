var msg="This is a test"
var i = 0
while (i < msg.length() ){
    if (msg.substring(i, i + 1) == " "){
        println()
    }
    else{
        print(msg.substring(i, i + 1))
    }
  i += 1
}