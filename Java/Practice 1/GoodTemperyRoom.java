import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GoodTemperyRoom {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть температуру в кімнаті:");
        double Troom = scanner.nextDouble();
        System.out.println("Введіть температуру на вулиці:");
        double Tenv = scanner.nextDouble();

        double k = 0;
        int timeOfWorkTermostat = 0;

        for (int hour = 1; hour != 25; hour++) {
            System.out.println("Зараз " + hour + " годин. Температура в кімнаті: " + Troom);

            if (Troom > 22 && Troom < 24) {
                if (timeOfWorkTermostat <= 8) {
                    System.out.println("Термостат - вкл.");
                    k = 0;
                    timeOfWorkTermostat++;
                } else {
                    System.out.println("Термостат - викл.");
                    k = -0.02;
                }
            } else if (Troom < 22) {
                System.out.println("Обігрівач - вкл.");
                k = 0.11;
            } else if (Troom > 24) {
                System.out.println("Кондиціонер - вкл.");
                k = -0.09;
            }

            Troom = Troom + (k * (Troom - Tenv));
            System.out.println("\n"); 
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