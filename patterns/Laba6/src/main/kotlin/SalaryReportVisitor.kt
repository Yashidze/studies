class SalaryReportVisitor : ReportVisitor {
    var totalSalary = 0.0
        private set

    @Override
    override fun visit(employee: Employee) {
        totalSalary += employee.salary
    }

    @Override
    override fun visit(department: Department) {
        for (employee in department.employees) {
            employee.accept(this)
        }
    }

    @Override
    override fun visit(company: Company) {
        for (department in company.departments!!) {
            department.accept(this)
        }
    }
}