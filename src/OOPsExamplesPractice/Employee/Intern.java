package OOPsExamplesPractice.Employee;

public class Intern extends Employee{
    private int stipend;

    public Intern(int id, String name, String department, int stipend) {
        super(id, name, department);
        this.stipend = stipend;
    }

    @Override
    public float calculateSalary() {
        return stipend;
    }
}
