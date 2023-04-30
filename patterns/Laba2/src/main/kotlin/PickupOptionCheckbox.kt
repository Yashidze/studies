class PickupOptionCheckbox(private val mediator: RegistrationMediator) {
    fun togglePickupOption(enabled: Boolean) {
        mediator.enablePickup(enabled)
    }
}