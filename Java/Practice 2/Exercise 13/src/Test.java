import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

            while (true)
            {
                try {
                    System.out.println("Введіть числа.");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("A = ");
                    int a = sc.nextInt();
                    System.out.print("B = ");
                    int b = sc.nextInt();
                    int sum = a+b;
                    System.out.println("Сума становить: " + sum);
                    break;
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Введіть числа знову.");
                }
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
