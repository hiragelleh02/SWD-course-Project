/*Create an EmployeeManagementFacade class that will provide high-level methods for:

- Adding an employee.
- Assigning a department and role to the employee.
- Generating reports based on employees' roles or departments.
- Calculating total compensation (salary + bonus) for a given employee.
This will encapsulate the complexity of interacting with different subsystems (e.g., EmployeeFactory, ReportGenerator, and BonusStrategy) into a simple interface.
 */

 import java.util.ArrayList;
 import java.util.List;
 
 public class EmployeeManagementFacade {
     private EmployeeFactory employeeFactory;
     private ReportGenerator reportGenerator;
     private List<Employee> employees;
 
     // Constructor
     public EmployeeManagementFacade(EmployeeFactory employeeFactory, ReportGenerator reportGenerator) {
         this.employeeFactory = employeeFactory;
         this.reportGenerator = reportGenerator;
         this.employees = new ArrayList<>();
     }
 
     // Add Employee Method
     public void addEmployee(String name, int age, String address, String employeeID, Department department, Role role, double salary, BonusStrategy bonusStrategy) {
         Employee employee = employeeFactory.createEmployee(name, age, address, employeeID, department, salary, bonusStrategy, role);
         employees.add(employee);
         System.out.println("Employee " + name + " added to department " + department + " as " + role);
     }
 
     // Generate Report by Department
     public void generateReportByDepartment(Department department) {
         System.out.println("Report for Department: " + department);
         for (Employee employee : employees) {
             if (employee.getDepartment() == department) {
                 employee.printInfo();
             }
         }
     }
 
     // Generate Report by Role
     public void generateReportByRole(Role role) {
         System.out.println("Report for Role: " + role);
         for (Employee employee : employees) {
             if (employee.getRole() == role) {
                 employee.printInfo();
             }
         }
     }
 
     // Calculate total compensation for an employee
     public void calculateTotalCompensation(String employeeID) {
         for (Employee employee : employees) {
             if (employee.getEmployeeID().equals(employeeID)) {
                 double totalCompensation = employee.calculateAnnualSalary() + employee.calculateBonus();
                 System.out.println("Total compensation for " + employee.getEmployeeID() + ": $" + totalCompensation);
                 return;
             }
         }
         System.out.println("Employee with ID " + employeeID + " not found.");
     }
 }
 