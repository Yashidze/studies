fun main(args: Array<String>?) {
        val databaseSingleton: DatabaseSingleton = DatabaseSingleton.Companion.getInstance()
        val postgresSQLDatabase = PostgresSQLDatabase()
        databaseSingleton.addDatabase("PostgresSQL", postgresSQLDatabase)
        val postgresql = databaseSingleton.getDatabase("PostgresSQL")
        postgresql!!.connect()
        postgresql.executeQuery("SELECT * FROM users")
        val mongoDBDatabase = MongoDBDatabase()
        databaseSingleton.addDatabase("MongoDB", mongoDBDatabase)
        val mongodb = databaseSingleton.getDatabase("MongoDB")
        mongodb!!.connect()
        mongodb.executeQuery("db.users.find()")
    }
