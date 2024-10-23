public class EmployeeReportGenerator implements ReportGenerator {
    
    @Override
    public void generateReport(Employee employee) {
        
        System.out.println("Generating report for: " + employee.getName());
        System.out.println();
        System.out.println("Age: " + employee.getAge());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());
        System.out.println("Bonus: " + employee.calculateBonus());
       
  
    }
    
    
}
