package ex_8;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Predicate;
public class Test
{
    static Employee[] employers = new Employee[10];
    public static void main(String[] args){
        employers[0] = new Employee(55,20,21400,"male","Сергій Миколайович Олексенко");
        employers[1] = new Employee(25,4, 12100,"male", "Ярослав Сергійович Кузьменко");
        employers[2] = new Employee(22,2,10122,"female","Катерина Степанівна Ганчук");
        employers[3] = new Employee(32,8, 14000,"female", "Анжеліка Сергіївна Олесь");
        employers[4] = new Employee(47,16,17400,"female","Анна Миколаївна Русач");
        employers[5] = new Employee(66,43, 38275,"female", "Ярослава Русланівна Сладенко");
        employers[6] = new Employee(22,1,8500,"male","Сергій Миколайович Босовський");
        employers[7] = new Employee(55,27, 28750,"male", "Микола Васильович Босовський");
        employers[8] = new Employee(63,37,34500,"male","Олег Володимирович Куклін");
        employers[9] = new Employee(69,50, 45000,"male", "Любов Віталіївна Тетеря");

        System.out.println("Employees who can retire");
        printEmployeesComplyingToPredicate(employers, Test::testIfCanRetire);

        System.out.println("Employees who shall be payed extra");
        printEmployeesComplyingToPredicate(employers, Test::testIfExtraPay);
        printTimeStamp();
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("\nMade by: " + sname + " on " + dateFormat.format(currentDate));
    }
    public static boolean testIfCanRetire(Employee employee) {
        if(employee.getSex() == "male" & employee.getAge()>65 & employee.getWorkExperience()>35)
        {
            return true;
        }
        else if(employee.getSex() == "female" & employee.getAge()>60 & employee.getWorkExperience() > 30)
        {
            return true;
        }
        else { return false; }
    }

    public static boolean testIfExtraPay(Employee employee){
        if (employee.getWorkExperience() > 15)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void printEmployeesComplyingToPredicate(Employee[] employees, Predicate<Employee> predicate) {
        for (Employee employee: employees) {
            if (predicate.test(employee)) {
                System.out.println(employee);
            }
        }
    }
}
