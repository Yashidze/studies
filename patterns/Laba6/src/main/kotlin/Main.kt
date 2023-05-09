import java.util.List

fun main(args: Array<String>?){
        val e1 = Employee("Ivanov", 50000)
        val e2 = Employee("Petrov", 30000)
        val e3 = Employee("Kinko", 35000)
        val e4 = Employee("Minko", 25000)
        val e5 = Employee("Jozef", 20000)
        val e6 = Employee("Fugo", 30000)
        val itDepartment = Department("IT", List.of(arrayOf(e1, e2, e3)))
        val hrDepartment = Department("HR", List.of(arrayOf(e4, e5, e6)))
        val company = Company(arrayOf(itDepartment, hrDepartment))
        val salaryReportVisitor = SalaryReportVisitor()
        company.accept(salaryReportVisitor)
        itDepartment.accept(salaryReportVisitor)
    }