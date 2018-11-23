def findcountries(c:String):String = {
        var city = ""
        if(c == "UK"){
            city = "London"
        }

        if(c == "USA"){
            city = "D.C"
        }

        if(c == "Pakistan"){
            city = "Islamabad"
        }
    return city
}

var countries = List("UK", "USA", "Pakistan")
var capitals = countries.map(findcountries)
print(capitals)