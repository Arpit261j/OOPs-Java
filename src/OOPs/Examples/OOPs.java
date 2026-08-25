package OOPs.Examples;

import java.util.ArrayList;
import java.util.List;

public class OOPs {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        service.addEmployee(new Employee(2, "Amit", 87000f, "IT"));
        service.addEmployee(new Employee(3, "Charan", 82000f, "CSE"));
        System.out.println(Employee.population);

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "Suresh", 85700f, "HR"));
        Employee a = new Employee(4,"Naresh",47000f, "Bank");


        System.out.println(a.getName());
        System.out.println(service.emp.get(0).getName());
        System.out.println(Employee.population);
////        System.out.println(emp.toString());
//        System.out.println(service.emp.toString());
//        service.removeEmployeeById(3);
//        System.out.println(service.emp.toString());
    }
}
