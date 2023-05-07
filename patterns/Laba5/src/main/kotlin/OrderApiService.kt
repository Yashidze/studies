class OrderApiService : BaseApiService() {
    override fun validate(entity: BaseEntity) {
        val order = entity as Order
        if (!order.validate()) {
            throw IllegalArgumentException("Order validation failed")
        }
    }

    override fun save(entity: BaseEntity?) {
        val order = entity as Order?
        // REST API call to save Order
    }

    override fun notifyAdmin(entity: BaseEntity?) {
        // no need to notify admin for Order
    }

    fun update(order: Order) {
        super.update(order)
        val json: String? = order.toJson()
        // return JSON representation of updated Order
    }
}