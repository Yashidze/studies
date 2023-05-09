class Department(var name: String, var employees: MutableList<Array<Employee>>) {

    fun accept(visitor: ReportVisitor) {
        visitor.visit(this)
    }
}