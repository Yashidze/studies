

class DatabaseSingleton private constructor() {
    private val databases: MutableMap<String?, Database?>

    init {
        databases = HashMap()
    }

    fun addDatabase(name: String?, database: Database?) {
        databases.put(name, database)
    }

    fun getDatabase(name: String): Database? {
        return databases[name]
    }

    companion object {
        fun getInstance(): DatabaseSingleton {

            return TODO("Provide the return value")
        }

        @get:Synchronized
        var instance: DatabaseSingleton? = null
            get() {
                if (field == null) {
                    field = DatabaseSingleton()
                }
                return field
            }
            private set
    }
}