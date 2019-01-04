var msg="This is a test"
var i = 0
var words = 0
while (i < msg.length() ){
    if (msg.substring(i, i + 1) == " "){
        words += 1
    }
  i += 1
}
println(words)