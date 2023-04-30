import java.util.*

class RegistrationPage : RegistrationMediator {
    private var deliveryDate: Date? = null
    private var isPickup = false
    private var showContactFields = false
    private var name: String? = null
    private var phoneNumber: String? = null

    @Override
    override fun deliverOn(date: Date?) {
        deliveryDate = date
    }

    @Override
    override fun enableContactFields(enabled: Boolean) {
        showContactFields = enabled
    }

    @Override
    override fun enablePickup(enabled: Boolean) {
        isPickup = enabled
        if (enabled) {
            showContactFields = false
        }
    }

    override fun updateName(name: String?) {
        this.name = name
    }

    override fun updatePhoneNumber(phoneNumber: String?) {
        this.phoneNumber = phoneNumber
    }
}