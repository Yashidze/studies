class InputElement(private val name: String) : FormElement {
    @Override
    override fun render() {
        println("<input type=\"text\" name=\"$name\">")
    }

    @Override
    override fun toString(): String {
        return "InputElement{" +
                "name='" + name + '\'' +
                '}'
    }
}