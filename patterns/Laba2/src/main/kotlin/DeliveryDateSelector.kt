import java.util.*

class DeliveryDateSelector(private val mediator: RegistrationMediator) {
    fun selectDeliveryDate(date: Date?) {
        mediator.deliverOn(date)
    }
}