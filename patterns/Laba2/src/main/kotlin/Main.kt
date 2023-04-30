fun main(args: Array<String>?) {
    val registrationPage = RegistrationPage()
    val dateSelector = DeliveryDateSelector(registrationPage)
    val pickupCheckbox = PickupOptionCheckbox(registrationPage)
    val contactFields = ContactFields(registrationPage)
    println(registrationPage)
    println(dateSelector)
    println(pickupCheckbox)
    println(contactFields)
}