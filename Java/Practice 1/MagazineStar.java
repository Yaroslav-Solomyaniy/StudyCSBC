import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MagazineStar {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String star = "*";
        String[] nameMarket = { "першого", "другого", "третього", "четвертого", "пятого" };
        int[] valueMarket = new int[5];
        // Цикли виводів інформації
        for (int i = 0; i < valueMarket.length; i++) {
            System.out.printf("Введіть виручку з %s магазину:", nameMarket[i]);
            valueMarket[i] = in.nextInt();
        }
        /*
         * Записали в масив значення магазинів і виводимо інформацію зірочками щодо виручки
         */
        for (int i = 0; i < valueMarket.length; i++) {
            int valueStar = valueMarket[i] / 100;
            System.out.printf("Виручка з %s магазину: %s [%d]\n", nameMarket[i], star.repeat(valueStar),
                    valueMarket[i]);
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