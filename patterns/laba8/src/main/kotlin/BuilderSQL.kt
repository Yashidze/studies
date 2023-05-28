interface BuilderSQL {
    fun select(columns: String): BuilderSQL
    fun whereSQL(condition: String): BuilderSQL
    fun limit(limit: Int): BuilderSQL
    val sQL: String
}