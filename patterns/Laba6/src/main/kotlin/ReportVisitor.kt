interface ReportVisitor {
    fun visit(employee: Employee)
    fun visit(department: Department)
    fun visit(company: Company)
}