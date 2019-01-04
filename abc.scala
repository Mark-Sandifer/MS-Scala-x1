//Simple array
val a = Array("apple", "Banana", "orange")

//Looping array items
for (e <- a) println(e)

//Loop with a block
for (e <- a) {
    val s = e.toUpperCase
    println(s)
}

//
val newArray = for (e <- a) yield {
    val s = e.toUpperCase
    s
}

