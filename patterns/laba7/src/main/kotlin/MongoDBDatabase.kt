internal class MongoDBDatabase : Database() {
    @Override
    public override fun connect() {
        System.out.println("Connected to MongoDB")
    }

    @Override
    override fun executeQuery(query: String) {
        System.out.println("Executed query: $query")
    }
}