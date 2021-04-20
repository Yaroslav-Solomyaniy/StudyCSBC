package ex_8;

public class Employee {
    private static int counterID = 1;
    private int id;
    private int age;
    private int workExperience;
    private double salary;
    private String sex;
    private String initials;

    public Employee(int age, int workExperience, double salary, String sex, String initials) {
        id = counterID++;
        this.age = age;
        this.workExperience = workExperience;
        this.salary = salary;
        this.sex = sex;
        this.initials = initials;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", workExperience=" + workExperience +
                ", salary=" + salary +
                ", sex='" + sex + '\'' +
                ", initials='" + initials + '\'' +
                '}';
    }
}
