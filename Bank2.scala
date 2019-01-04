import java.sql.{Statement,Connection, DriverManager}


class bank{
    var choice5 = ""
    var acno = 0
    var usern = ""
    var usera = ""
    var statement:Statement=null

    try{
        Class.forName("com.mysql.jdbc.Driver")
        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "")
        statement = connection.createStatement
    
    }
    catch{
        case ex:Exception=> {
            println(ex.toString())
        }
    }

    def account{
        println("Input new user name")
        usern = readLine()
        println("Input new user address")
        usera = readLine()
        statement.executeUpdate("insert into personal values(NULL, '"+usern+"', '"+usera+"')")
        val aa = statement.executeQuery("SELECT max(acno) from personal")
        if (aa.next) {
            val acno1 = aa.getString("max(acno)")
            println("Your new account number is: " + acno1)
        }
    }


    def withdraw(w:Int) = {
        println("Please enter account number")
        acno = readInt
        val ab = statement.executeQuery("SELECT * FROM personal WHERE ACNO = '"+acno+"'")
        while (ab.next) {
            val name1 = ab.getString("Name")
            val address1 = ab.getString("Address")
            println("Name: " + name1)
            println("Address: " + address1)
        }
        var showbal = balance(acno)
        println("Current balance is: " + showbal)
        if(w > showbal){
            println("Not enough funds")
        }
        else{
            statement.executeUpdate("insert into withdraw values('"+acno+"', '"+w+"', now())")
            println(s"$w has been taken out of your account, new balance is: " + (showbal - w))
        }
        
    }
    def deposit(d:Int) = {
        println("Please enter account number")
        acno = readInt
        val ac = statement.executeQuery("SELECT * FROM personal WHERE ACNO = '"+acno+"'")
       if (ac.next) {
            val name1 = ac.getString("Name")
            val address1 = ac.getString("Address")
            println("Name: " + name1)
            println("Address: " + address1)
        }
        statement.executeUpdate("insert into deposit values('"+acno+"', '"+d+"', now())")
        println(s"$d has been deposited into your account")
        var showbal = balance(acno)
        println("Current balance is: " + showbal)
        
    }

    def balance(acno:Int):Int={
        val x1 = statement.executeQuery("select sum(amount) from deposit where ACNO = '"+acno+"'")
        x1.next
        var depbal = x1.getInt("sum(amount)")
        val x2 = statement.executeQuery("select sum(amount) from withdraw where ACNO = '"+acno+"'")
        x2.next
        var witbal = x2.getInt("sum(amount)")
        var showbal = depbal - witbal
        return showbal
    }
}
var test = new bank()
var choice = 0
var test2 = List(2, 3, 4, 5, 6, 7, 8, 9)
var test3 = test2.map(test.balance)
println(test3)


while(choice !=4 ){
    println("Please choose what you would like to do (1/2/3/4)")
    println("1.Create account")
    println("2.Deposit Money")
    println("3.Withdraw Money")
    println("4.End program")
    
    choice = readInt()
    choice match{
        case 1 => test.account
        case 2 => println("Input deposit amount")
            test.deposit(readInt)
        case 3 => println("Input withdraw amount")
            test.withdraw(readInt)
        case _ =>println()
    }

}