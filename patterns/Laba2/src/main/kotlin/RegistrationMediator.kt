import java.util.*

interface RegistrationMediator {
    fun deliverOn(date: Date?)
    fun enableContactFields(enabled: Boolean)
    fun enablePickup(enabled: Boolean)
    fun updateName(name: String?)
    fun updatePhoneNumber(phoneNumber: String?)
}