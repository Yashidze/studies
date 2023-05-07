class Order : BaseEntity() {
    var product: Product? = null
    var user: User? = null
    var quantity = 0
    fun validate(): Boolean {
        // validation logic for Order
        return true
    }

    fun toJson(): String? {
        // JSON representation of Order
        return null
    }
}