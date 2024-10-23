// ObservableEmployeeList Class

import java.util.ArrayList;
import java.util.List;

public class ObservableEmployeeList
{
    private List<Employee> employees = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    // Add observer to the list
    public void addObserver(Observer observer) 
    {
        observers.add(observer);
    }

    // Add employee and notify observers
    public void addEmployee(Employee employee) {
        employees.add(employee);
        notifyObservers("New employee added: " + employee.getName());
    }

    // Notify all observers
    private void notifyObservers(String message) {
        for (Observer observer : observers) 
        {
            observer.update(message);
        }
    }
    // Update employee's role and notify observers
    public void updateEmployeeRole(Employee employee, Role newRole) {
        // Update employee's role logic here
        employee.setRole(newRole); 
        notifyObservers("Updated employee: " + employee.getName() + " to role: " + newRole);
    }

    // Update employee's department and notify observers
    public void updateEmployeeDepartment(Employee employee, Department newDepartment) {
        // Update employee's department logic here
        employee.setDepartment(newDepartment); 
        notifyObservers("Updated employee: " + employee.getName() + " to department: " + newDepartment);
    }
    
   
}