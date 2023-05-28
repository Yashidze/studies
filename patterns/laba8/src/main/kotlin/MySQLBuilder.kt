class MySQLBuilder : BuilderSQL {
    private val query: StringBuilder

    init {
        query = StringBuilder()
    }

    override fun select(columns: String): BuilderSQL {
        query.append("SELECT $columns")
        return this
    }

    override fun whereSQL(condition: String): BuilderSQL {
        query.append(" WHERE $condition")
        return this
    }

    override fun limit(limit: Int): BuilderSQL {
        query.append(" LIMIT $limit")
        return this
    }

    override val sQL: String
        get() = query.toString()
}