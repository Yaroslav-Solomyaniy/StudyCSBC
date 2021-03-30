import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;

public class WindChillIndex {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть температуру в °C:");
        double tempery = in.nextDouble();
        System.out.print("Введіть швидкість вітру в км/год:");
        double speedWind = in.nextDouble();
        if (tempery < 10 & speedWind > 4.8) {
            double wci = 13.12 + 0.6215 * tempery - 11.37 * Math.pow(speedWind, 0.16)
                    + 0.3965 * tempery * Math.pow(speedWind, 0.16);
            int roundWCI = (int) Math.round(wci);
            System.out.println("Індекс прохолодності вітру становить:" + roundWCI);
        } else {
            System.out.println("Введені параметри не підходять для обчислення індексу прохолодності.");
        }
        printTimeStamp();
        in.close();
    }

    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }

}
