package OOPsExamplesPractice.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMangementSystem {
    private List<Employee> employeeList = new ArrayList();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void printEmployeeNames() {
        for(Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
    }

    public void calculateSalary() {
        for (Employee employee : employeeList) {
            System.out.println(employee.calculateSalary());
        }
    }
}
