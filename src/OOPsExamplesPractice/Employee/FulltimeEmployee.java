package OOPsExamplesPractice.Employee;

public class FulltimeEmployee extends Employee{

    private float salary;

    public FulltimeEmployee(int id, String name, float salary, String department) {
        super(id, name, department);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public float calculateSalary() {
        return salary;
    }
}
