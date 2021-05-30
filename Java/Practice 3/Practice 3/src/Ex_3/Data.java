package Ex_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
        Employee[] SuperEmployee =
                {
                        new Employee("Yarik",5250),
                        new Employee("Stanislav",5000),
                        new Employee("Maksim",5900)
                };
        double temp = average(SuperEmployee);
        System.out.println(temp);
        Measurable temp2 = largest(SuperEmployee);
        System.out.println(temp2.largest());
        printTimeStamp();
    }
    public static double average(Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0)
        {
            double a = Math.round(sum/ objects.length);
            return a;
        }
        else
        {
            return 0;
        }
    }
    public static Measurable largest(Measurable[] objects) {
        Measurable max = null;
        for (Measurable obj : objects) {
            if (max == null || obj.getMeasure() > max.getMeasure()) {
                max = obj;
            }
        }
        return max;
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("\nMade by: " + sname + " on " + dateFormat.format(currentDate));
    }
}