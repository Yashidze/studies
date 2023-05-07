class UserApiService : BaseApiService() {
    override fun validate(entity: BaseEntity) {
        val user = entity as User
        if (user.email != null) {
            throw IllegalArgumentException("Email cannot be updated")
        }
        if (!user.validate()) {
            throw IllegalArgumentException("User validation failed")
        }
    }

    override fun save(entity: BaseEntity?) {
        // REST API call to save User
    }

    override fun notifyAdmin(entity: BaseEntity?) {
        // no need to notify admin for User
    }
}