import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] arg) {
        int number;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введіть ціле число: ");
            try {
                number = Integer.parseInt(sc.next());
                System.out.println("Ви ввели: "+ number);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Ви ввели не числове значення!Повторіть спробу");
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
