var input = readLine()
input match{
    case "West"|"west" => println("west")
    case "North"|"north" => println("north")
    case "East"|"east" => println("east")
    case "South"|"south" => println("south")
    case _ => println("Invalid direction")
}
