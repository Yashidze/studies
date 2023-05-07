class Product : BaseEntity() {
    var name: String? = null
    var price = 0.0
    fun validate(): Boolean {
        // validation logic for Product
        return true
    }

    fun notifyAdmin() {
        // send notification to admin in case validation fails
    }
}