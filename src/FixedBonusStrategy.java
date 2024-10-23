/*
  This class is suppose to return fixed-based bonus for various roles
*/
public class FixedBonusStrategy implements BonusStrategy {
    @Override
    public double calculateBonus(double salary) {
        return 500; // fixed bonus
    }
}