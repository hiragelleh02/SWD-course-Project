public class PerformanceBonusStrategy implements BonusStrategy {
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.20; // 10% bonus based on salary
    }
}