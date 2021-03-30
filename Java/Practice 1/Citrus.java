import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;

public class Citrus {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть кількість опитаних людей:");
        int numbers = in.nextInt();

        System.out.println("Ви ввели:" + numbers);

        int week = (int) (numbers * 0.14);
        System.out.println("Кількість людей, які купують принаймні один напій компанії в тиждень:" + week);

        int CitrusFollow = (int) Math.round(week * 0.64);
        System.out.println("Кількість людей, які ввідають перевагу цитрусовим напоям:" + CitrusFollow);
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
