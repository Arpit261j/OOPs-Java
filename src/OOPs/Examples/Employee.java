package OOPs.Examples;

public class Employee {
    //id, name, salary, department
    private int id;
    private String name;
    private float salary;
    private String department;
    static int population;

    Employee (int id, String name, float salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        Employee.population+= 1;
    }

    static void message() {
        System.out.println("Hello");
        System.out.println(Employee.population);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
