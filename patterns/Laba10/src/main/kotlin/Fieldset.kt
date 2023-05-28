import java.util.ArrayList

class Fieldset : FormElement {
    private val elements: ArrayList<FormElement>

    init {
        elements = ArrayList()
    }

    fun addElement(element: FormElement) {
        elements.add(element)
    }

    @Override
    override fun render() {
        println("<fieldset>")
        for (element in elements) {
            element.render()
        }
        println("</fieldset>")
    }

    @Override
    override fun toString(): String {
        return "Fieldset{" +
                "elements=" + elements +
                '}'
    }
}