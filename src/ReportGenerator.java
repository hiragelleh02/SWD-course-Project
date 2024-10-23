import java.util.List;

class ReportGenerator {
    public void generateReportByDepartment(Department department, List<Employee> employees) {
        System.out.println("Report for Department: " + department);
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getName() + " - " + employee.getRole());
            }
        }
    }

    public void generateReportByRole(Role role, List<Employee> employees) {
        System.out.println("Report for Role: " + role);
        for (Employee employee : employees) {
            if (employee.getRole() == role) {
                System.out.println(employee.getName() + " - " + employee.getDepartment());
            }
        }
    }
}



