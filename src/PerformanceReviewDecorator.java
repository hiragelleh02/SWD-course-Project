public class PerformanceReviewDecorator extends CompensationDecorator {
    private double performanceScore;

    public PerformanceReviewDecorator(Employee employee, double performanceScore) {
        super(employee);
        this.performanceScore = performanceScore;
    }

    @Override
    public double calculateTotalCompensation() {
        double baseCompensation = super.calculateTotalCompensation();
        double performanceBonus = performanceScore > 4.0 ? 2000 : 0;  // Example: a score > 4.0 gives a bonus
        return baseCompensation + performanceBonus;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Performance Review Score: " + performanceScore);
    }
}
