def checkno(a:Int):Boolean = {
    if(a % 2 == 0){
        return true
    }
    else{
        return false
    }
}

var list1 = List(24, 37, 42, 92, 362, 63)
var list2 = list1.filter(checkno)
println(list2)