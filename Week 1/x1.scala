class results{
    var phy = 0
    var che = 0
    var mat = 0
    def showresults()={
        var total = phy+che+mat
        var per = total * 100/450
        println(total)
        println(per)
    }
}

var ref = new results()

    ref.phy = 79
    ref.che = 50
    ref.mat = 90
    ref.showresults()