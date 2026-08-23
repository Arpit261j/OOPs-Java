package OOPs;

import java.util.*;

public class EmployeeService {
    List<Employee> emp = new ArrayList<Employee>();

    public void addEmployee(Employee e) {
        emp.add(e);
    }

    public boolean removeEmployeeById(int id) {
        return emp.removeIf(e -> e.getId() == id);
    }
}
