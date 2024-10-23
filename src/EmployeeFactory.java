/*
 * Create EmployeeFactory to Generate Role-Specific Employees: 
 * Implement an EmployeeFactory to create employees based on their role and department.
 */
public class EmployeeFactory {
    public Employee createEmployee(String name, int age, String address, String employeeID, Department department, double salary, BonusStrategy bonusStrategy, Role role) {
        return new Employee(name, age, address, employeeID, department, salary, bonusStrategy, role);
    }
}

// idontknow this one sxb