package ex_10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("Введіть ваш зріст:");
        double rost = info.nextDouble();

        System.out.println("Введіть вашу стать:(male and female)");
        String sex = info.next();

        System.out.println("Введіть ваш вік:");
        int age = info.nextInt();

        System.out.println("Введіть вашу масу тіла:");
        int massa = info.nextInt();

        if (age>19)
        {
            double imt = Math.round(massa/Math.pow(rost,2));
            if (sex.equals("male"))
            {
                if(imt < 20)
                {
                    System.out.println("Діагноз для чоловіка: | Нестача маси | IMT = "+imt);
                }
                else if(imt >20 && imt<25)
                {
                    System.out.println("Діагноз для чоловіка: | Нормальна маса | IMT = "+imt);
                }
                else if(imt>25&&imt<30)
                {
                    System.out.println("Діагноз для чоловіка: | Надмірна маса | IMT = "+imt);
                }
                else if(imt>30&&imt<40)
                {
                    System.out.println("Діагноз для чоловіка: | Ожиріння | IMT = "+imt);
                }
                else if(imt>40)
                {
                    System.out.println("Діагноз для чоловіка: | Тяжке ожиріння | IMT = "+imt);
                }
            }
            else if(sex.equals("female"))
            {
                if(imt < 19)
                {
                    System.out.println("Діагноз для жінки: | Нестача маси | IMT = "+imt);
                }
                else if(imt>19&&imt<24)
                {
                    System.out.println("Діагноз для жінки: | Нормальна маса | IMT = "+imt);
                }
                else if(imt>25&&imt<30)
                {
                    System.out.println("Діагноз для жінки: | Надмірна маса | IMT = "+imt);
                }
                else if(imt>30&&imt<40)
                {
                    System.out.println("Діагноз для жінки: | Ожиріння | IMT = "+imt);
                }
                else if(imt>40)
                {
                    System.out.println("Діагноз для жінки: | Тяжке ожиріння | IMT = "+imt);
                }
            }
            else
            {
                System.out.println("Невірно введена стать.");
            }

        }
        else
        {
            System.out.println("Ваш вік менше 19.");
        }
        printTimeStamp();
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
