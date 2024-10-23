import java.util.ArrayList;
import java.util.List;

public class Employee extends Person implements Compensable{
    String employeeID;
    Department department;
    double salary;
    public BonusStrategy bonusStrategy;
    public Role role;


    //Constructor
    public Employee(String name, int age, String address, String employeeID, Department department, double salary, BonusStrategy bonusStrategy,Role role ) {

        super(name, age, address);
        this.employeeID=employeeID;
        this.department=department;
        this.salary=salary;
        this.bonusStrategy = bonusStrategy;
        this.role = role;
        
             }
  
   public String getEmployeeID() { return employeeID; }
   public Department getDepartment() { return department; }
   public double getSalary() { return salary; }
   public Role getRole() { return role; }
   public void setRole(Role newRole) { this.role = newRole;}
   public void setDepartment(Department newDepartment) {this.department = newDepartment;}


    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Employee Information: ");
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+salary);
             }
    
    // annual salary
    @Override
    public double calculateAnnualSalary(){
      return salary * 12; // base annual salary 
    }
    // calculate Bonus
    @Override
    public double calculateBonus() {
        return bonusStrategy.calculateBonus(getSalary());
    }

    public double calculateTotalCompensation() {
        double totalCompensation = salary + calculateBonus();  // Base salary + bonus
        return totalCompensation;
    }
    
  
}
    
  
