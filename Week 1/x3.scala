class results{
    private var phy:Int = 0
    private var che:Int = 0
    private var mat:Int = 0
    private var total:Int = 0
    private var invalid:Int = 0
    private var fail:Int = 0

    def grades(marks:Float):String={
            var grade="";
            if (marks >= 90)  grade= "A+"
              else if (marks >= 80) grade= "A"
                else if (marks >=70)  grade= "B"
                    else if (marks>=60 ) grade= "C"
                    else{
                        grade="Fail"
                        fail += 1
                        println("You have failed the exam")
                    }
            return grade
    }

    def Physics(a:Int) = {
        if(a >= 0 && a <= 150){
            phy = a
        }

        else{ println("Sorry, This grade is invalid")
            invalid += 1
        }
    }
    def Chemistry(a:Int) = {
        if(a >= 0 && a <= 150){
            che = a
        }

        else{
            println("Sorry, This grade is invalid")
            invalid += 1
        }
    }
    def Maths(a:Int) = {
        if(a >= 0 && a <= 150){
            mat = a
        }

        else{
            println("Sorry, This grade is invalid")
            invalid += 1
        }
    }


    private def Calculations() = {
        total = phy + che + mat
    }
    if(invalid >= 1){
    println("One or more marks are invalid therefore no grades have been given")
    }
    def showresults() = {
    if(invalid >= 1){
    println("One or more marks are invalid therefore no grades have been given")
    }

    if(invalid <= 0){
        Calculations()
        println(s"Total marks: $total")

            println(" Your Physics Grade is "+ grades(phy))
            println(" Your Chemistry Grade is "+ grades(che))
            println(" Your MAth Grade is "+ grades(mat))

            if (fail == 1){
                println("Retake the exam")
                }
            if (fail == 2){
                println("Retake the course")
            }
            if (fail == 3){
                println("Go home")
            }
    }
    }
}

var ref = new results()
    ref.Physics(12)
    ref.Chemistry(120)
    ref.Maths(150)
    ref.showresults()