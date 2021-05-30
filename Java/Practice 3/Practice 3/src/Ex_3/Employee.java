package Ex_3;

public class Employee implements Measurable{
    private String name;
    private int salary;

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure()
    {
    return salary;
    }

    @Override
    public String largest()
    {
        return name;
    }
}
