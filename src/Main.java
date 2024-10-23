import java.util.*;

import javax.swing.text.StyledEditorKit.AlignmentAction;

public class Main {
  public static void main(String[] args) {
      // Create subsystems
      EmployeeFactory employeeFactory = new EmployeeFactory();
      ReportGenerator reportGenerator = new ReportGenerator();
      
      // Create the facade
      EmployeeManagementFacade facade = new EmployeeManagementFacade(employeeFactory, reportGenerator);

      // Add employees (Clark Kent and Bruce Wayne)
      facade.addEmployee("Clark Kent", 30, "Space", "E12345", Department.Engineering, Role.ENGINEER, 85000.00, new ProjectBonusStrategy());
      facade.addEmployee("Bruce Wayne", 30, "In a cave", "E12346", Department.Engineering, Role.ENGINEER, 85000.00, new ProjectBonusStrategy());

      // Add managers (Lois Lane and Celina idk)
      facade.addEmployee("Lois Lane", 25, "Somethingvile", "M67890", Department.IT, Role.MANAGER, 95000.00, new PerformanceBonusStrategy());
      facade.addEmployee("Celina idk", 25, "Gotham", "M87890", Department.IT, Role.MANAGER, 95000.00, new PerformanceBonusStrategy());

      // Generate reports
      facade.generateReportByDepartment(Department.Engineering);System.out.println();
      facade.generateReportByRole(Role.MANAGER);System.out.println();

      // Calculate total compensation
      facade.calculateTotalCompensation("E12345");  // Clark Kent
      facade.calculateTotalCompensation("E12346");  // Bruce Wayne
      facade.calculateTotalCompensation("M67890");  // Lois Lane
      facade.calculateTotalCompensation("M87890");  // Celina idk

      // Create a basic employee
      Employee employee = new Employee("Alice", 35, "456 Oak St", "E456", Department.Engineering, 90000, new ProjectBonusStrategy(), Role.ENGINEER);

      // Decorate with a performance review
      Employee decoratedEmployee = new PerformanceReviewDecorator(employee, 4.5);

      // Further decorate with a certification
      decoratedEmployee = new CertificationDecorator(decoratedEmployee, "AWS Certified");

      // Print total compensation
      decoratedEmployee.printInfo();
      System.out.println("Total Compensation: $" + decoratedEmployee.calculateTotalCompensation());
  }
  

      /*RoleReportGenerator roleReporter = new RoleReportGenerator();
      DepartmentReportGenerator departmentReporter = new DepartmentReportGenerator();
      
      
      Employee dude = new Employee("Clark Kent", 30, "Space", "E12345",Department.Engineering, 85000.00, new ProjectBonusStrategy(), Role.ENGINEER);
      Employee dude2 = new Employee("Bruce Wayne", 30, "In a cave", "E12345",Department.Engineering, 85000.00, new ProjectBonusStrategy(), Role.ENGINEER);
      
     
      Manager managerLady = new Manager("Lois Lane", 25, "Somethingvile", "M67890", Department.IT, 95000.00, 5, 10000.00, new PerformanceBonusStrategy(), Role.MANAGER);
      Manager managerLady2 = new Manager("Celina idk", 25, "Gotham", "M87890", Department.IT, 95000.00, 5, 10000.00, new PerformanceBonusStrategy(), Role.MANAGER);

      
      EmployeeFactory newbie = new EmployeeFactory();
      newbie.createsEmployee("Alice Johnson", 40,"789 Birch Lane", "M67890", Department.IT, 95000.00, 5,10000.00, new PerformanceBonusStrategy(), Role.MANAGER);
     
      ObservableEmployeeList employeeList = new ObservableEmployeeList();
      employeeList.addObserver(new HRDepartmentObserver());
      employeeList.addObserver(new ManagerObserver());
      employeeList.addEmployee(dude2); // Triggers notifications

      System.out.println("Whose that? " );
      roleReporter.generateReport(dude2);System.out.println();
      System.out.println("Yeah, moving him up to manager..."); System.out.println();
      employeeList.updateEmployeeRole(dude2, Role.MANAGER); 
      System.out.println();

      ExternalSalaryCalculator externalCalculator = new ExternalSalaryCalculator();
      Compensable salaryAdapter = new ExternalSalaryAdapter(externalCalculator);
      System.out.println("Total Compensation: " + salaryAdapter.calculateAnnualSalary());


*/

      /* 
    
    List<Employee> employeeListt= new ArrayList<>();
    employeeListt.add(dude);employeeListt.add(dude2); employeeListt.add(managerLady); employeeListt.add(managerLady2);

    // tests role report generator
    System.out.println("The following are our employee with engineering roles: ");System.out.println();
    roleReporter.generateReportByRole(Role.ENGINEER,employeeListt); System.out.println();
    System.out.println("The following are our managers for the IT department: ");System.out.println();
     departmentReporter.generateReportByDepartment(Department.IT, employeeListt);
     System.out.println();


     System.out.println("What is the compensation of a manager like Lois?");
     System.out.println("Her salary would be "+ managerLady.getSalary()+ " with a yearly bonus of " + managerLady.calculateBonus()+ " based on performance." );System.out.println();
     
     System.out.println("What is the compensation for engineers like Mr. Wayne?");
     System.out.println("His salary would be "+ dude2.getSalary()+" with a bonus of "+dude2.calculateBonus() + " on a project basis." );
     System.out.println();
*/

  }
}