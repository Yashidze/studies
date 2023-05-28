fun main(args: Array<String>?) {
        val mySQLBuilder: BuilderSQL = MySQLBuilder()
        mySQLBuilder.select("name,age").whereSQL("age>30").limit(20)
        println("Result query : " + mySQLBuilder.sQL)
        val pgSQLBuilder: BuilderSQL = PostgreSQLBuilder()
        pgSQLBuilder.select("name, age").whereSQL("age>50").limit(50)
        println("Result query: " + pgSQLBuilder.sQL)
    }