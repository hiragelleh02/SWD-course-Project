public class CertificationDecorator extends CompensationDecorator {
    private String certification;

    public CertificationDecorator(Employee employee, String certification) {
        super(employee);
        this.certification = certification;
    }

    @Override
    public double calculateTotalCompensation() {
        double baseCompensation = super.calculateTotalCompensation();
        double certificationBonus = certification.equals("AWS Certified") ? 3000 : 0;  // Example: AWS cert gives a $3000 bonus
        return baseCompensation + certificationBonus;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Certification: " + certification);
    }
}
