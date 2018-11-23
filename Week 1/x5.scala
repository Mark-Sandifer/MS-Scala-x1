def binary(no:Int):String ={
        no match{
            case 0|1 => (s"$no")
            case _ => (s"${binary(no/2)}${no%2}")
    }
}
print(binary(9))