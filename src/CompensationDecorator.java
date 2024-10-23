public abstract class CompensationDecorator extends Employee {
    protected Employee decoratedEmployee;

    public CompensationDecorator(Employee employee) {
        // Pass the properties of the employee to the super constructor
        super(employee.name, employee.age, employee.address, employee.employeeID, employee.department, employee.salary, employee.bonusStrategy, employee.role);
        this.decoratedEmployee = employee;
    }

    // We will override calculateTotalCompensation to add custom logic in concrete decorators
    @Override
    public double calculateTotalCompensation() {
        return decoratedEmployee.calculateTotalCompensation();
    }

    @Override
    public void printInfo() {
        decoratedEmployee.printInfo(); // Print the decorated employee's info first
    }
}
