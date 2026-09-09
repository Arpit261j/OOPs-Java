package OOPsExamplesPractice.Employee;

public class ParttimeEmployee extends Employee{
    private int hour;
    private int rate;

    public ParttimeEmployee(int id, String name, String department, int hour, int rate) {
        super(id, name, department);
        this.hour = hour;
        this.rate = rate;
    }

    public int getHour() {
        return hour;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public float calculateSalary() {
        return hour * rate;
    }
}
