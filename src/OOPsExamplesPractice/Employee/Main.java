package OOPsExamplesPractice.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeMangementSystem system = new EmployeeMangementSystem();
        system.addEmployee(new FulltimeEmployee(1, "ARPIT", 5000000, "CSE"));
        system.addEmployee(new ParttimeEmployee(1, "Rahul", "CSE", 10, 250));
        system.addEmployee(new Intern(1, "Raj", "CSE", 100000));

        List<FulltimeEmployee> employeeList = new ArrayList<>();
        employeeList.add(new FulltimeEmployee(1,"Karan",1000000, "IT"));
        for (FulltimeEmployee employee : employeeList) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }

        system.printEmployeeNames();
        system.calculateSalary();


    }
}
