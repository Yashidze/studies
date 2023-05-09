class Employee(var name: String, var salary: Int) {

    fun accept(visitor: ReportVisitor) {
        visitor.visit(this)
    }
}