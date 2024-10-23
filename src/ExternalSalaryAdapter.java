// ExternalSalaryAdapter Class

public class ExternalSalaryAdapter implements Compensable {
    private ExternalSalaryCalculator externalCalculator;
    
    public ExternalSalaryAdapter(ExternalSalaryCalculator externalCalculator) {
        this.externalCalculator = externalCalculator;
    }
    
    @Override
    public double calculateAnnualSalary() {
        // Adapting third-party logic to match the Compensable interface
        return externalCalculator.calculateExternalSalary();
    }

    @Override
    public double calculateBonus() {
        // You can adapt this to whatever logic fits the bonus, 
        // assuming externalCalculator doesn't already handle it
        return externalCalculator.calculateExternalBonus();
    }
}