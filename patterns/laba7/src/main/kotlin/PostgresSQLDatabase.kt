internal class PostgresSQLDatabase : Database() {
    @Override
    public override fun connect() {
        System.out.println("Connected to PostgresSQL")
    }

    @Override
    override fun executeQuery(query: String) {
        System.out.println("Executed query: $query")
    }
}