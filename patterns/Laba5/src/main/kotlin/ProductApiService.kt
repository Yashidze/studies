class ProductApiService : BaseApiService() {
    override fun validate(entity: BaseEntity) {
        val product = entity as Product
        if (!product.validate()) {
            product.notifyAdmin()
            throw IllegalArgumentException("Product validation failed")
        }
    }

    override fun save(entity: BaseEntity?) {
        // REST API call to save Product
    }

    override fun notifyAdmin(entity: BaseEntity?) {
        // send notification to admin about failed validation
    }
}