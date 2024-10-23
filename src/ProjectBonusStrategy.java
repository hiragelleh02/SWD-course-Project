/*
  This class is suppose to calculate Project-based on bonuses for engineers. 
  Using abstraction to uphold SOLID principles, particularly Open/Closed Principle.
*/
public class ProjectBonusStrategy implements BonusStrategy {
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.15; // 15% bonus based on projects 
    }
}