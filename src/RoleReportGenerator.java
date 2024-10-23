/*
 * The purpose of this class is to generate a report based on the role or deparment of an employee
 */

import java.util.List;


public class RoleReportGenerator extends EmployeeReportGenerator
{   
    public void generateReportByRole(Role role, List<Employee> employees) // by role
    {
        for(Employee employee : employees)
        {
            if(employee.getRole().equals(role))
            {
                System.out.println("Employee: "+ employee.getName() 
                + " -Role: "+ employee.getRole());
            }
        }
    }
    
    

}

