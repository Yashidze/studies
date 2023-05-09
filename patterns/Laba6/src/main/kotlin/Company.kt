class Company {
    var name: String? = null
    var departments: List<Department>? = null

    constructor(name: String?, departments: List<Department>?) {
        this.name = name
        this.departments = departments
    }

    constructor(departments: Array<Department>?) {}

    fun accept(visitor: ReportVisitor) {
        visitor.visit(this)
    }
}