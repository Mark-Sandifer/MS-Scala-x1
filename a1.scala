import java.sql.{Connection, DriverManager}

    try {
        Class.forName("com.mysql.jdbc.Driver")
        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "")
        val statement = connection.createStatement
        val rs = statement.executeQuery("SELECT * FROM table1")
        println("--------------------")
        while (rs.next) {
            val name1 = rs.getString("name")
            val address1 = rs.getString("address")
            println(name1 + "....." + address1)
        }
        statement.executeUpdate("insert into table1 values('joe', 'liverpool')")
    }   catch {
        case e: Exception => println(e)
    }