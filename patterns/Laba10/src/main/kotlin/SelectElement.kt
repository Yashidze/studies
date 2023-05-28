internal class SelectElement(private val name: String, private val options: List<String>) :
    FormElement {
    @Override
    override fun toString(): String {
        return "SelectElement{" +
                "name='" + name + '\'' +
                ", options=" + options +
                '}'
    }

    @Override
    override fun render() {
        println("<select name=\"$name\">")
        for (option in options) {
            System.out.println("<option value=\"$option\">$option</option>")
        }
        println("</select>")
    }
}