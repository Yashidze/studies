class ContactFields(private val mediator: RegistrationMediator) {
    fun enableFields(enabled: Boolean) {
        mediator.enableContactFields(enabled)
    }

    fun updateName(name: String?) {
        mediator.updateName(name)
    }

    fun updatePhoneNumber(phoneNumber: String?) {
        mediator.updatePhoneNumber(phoneNumber)
    }
}