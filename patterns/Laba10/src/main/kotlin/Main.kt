fun main(args: Array<String>?) {
        // Створення елементів форми
        val usernameInput: FormElement = InputElement("username")
        val countrySelect: FormElement =
            SelectElement("country", listOf("USA", "Canada", "Ukraine"))

        // Створення групи полів вводу
        val personalInfoFieldset = Fieldset()
        personalInfoFieldset.addElement(usernameInput)
        personalInfoFieldset.addElement(countrySelect)

        // Відображення форми
        personalInfoFieldset.render()
    }