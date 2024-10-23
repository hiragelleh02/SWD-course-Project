/*
 * Manager class extends to employee and overrides it to: 
    * print info specific to the manager (team size, bonus)
    * calculateAnnualSalary()
    * getBonus()
* implements RoleSpecific with 
    * performRoleSpecificTask()
 */
public class Manager extends Employee implements RoleSpecific{
    int teamSize;
    double bonus;
    


    //Constructor
    public Manager(String name, int age, String address, String employeeID, Department department, double salary, int teamSize, double bonus,  BonusStrategy bonusStrategy, Role role) {

        super(name, age, address, employeeID, department, salary, bonusStrategy, role);
        this.teamSize=teamSize;
        this.bonus=bonus;
  
        
        
    }
    
  
  public int getTeamSize() { return teamSize; }
   public double getBonus() { return bonus; }
  

    public double calculateTotalCompensation(){
            return salary+bonus;
    }
    

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Manager Information: ");
        System.out.println("Team size: "+teamSize);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Compensation: "+calculateTotalCompensation() + calculateBonus());
            }
            
     // new Code
     //annual salary
    @Override
    public double calculateAnnualSalary(){
      return super.calculateAnnualSalary() + 5000; // Managers get extra 
    }
    
    // bonus
    public double getBonus(double salary){
      return bonusStrategy.calculateBonus(salary);
    }
    
    @Override
    public void performRoleSpecificTask()
    {
      System.out.println("Manager is leading the team.");
    }
  
}
