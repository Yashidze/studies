abstract class Database {
    abstract fun connect()
    abstract fun executeQuery(query: String)
}