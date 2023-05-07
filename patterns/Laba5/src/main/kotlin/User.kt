class User : BaseEntity() {
    var name: String? = null
    var email: String? = null
    fun validate(): Boolean {
        // validation logic for User
        return true
    }
}