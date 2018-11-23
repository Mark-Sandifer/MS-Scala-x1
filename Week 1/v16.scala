var msg="This is a test"
var i = 0
var find = "is"
var amNo = 0
while (i < msg.length()-(find.length() -1) ){
    if (msg.substring(i, i + find.length()) == find){
        amNo += 1
    }
  i += 1
}
println(amNo)