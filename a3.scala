import java.sql.{Connection, DriverManager}

    try {
        Class.forName("com.mysql.jdbc.Driver")
        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "")
        val statement = connection.createStatement
        val rs = statement.executeQuery("SELECT * FROM table1")
        println("--------------------")
        statement.executeUpdate(s"insert into table1 values($usern, $usera)")
    }   catch {
        case e: Exception => println(e)
    }