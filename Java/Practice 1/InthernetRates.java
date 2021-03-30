import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;

public class InthernetRates {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Тариф номер 1|Тариф 1000|1000 МБ на місяць за 20 грн,позатарифно: 1Мб = 0.05грн");
        System.out.println("Тариф номер 2|Тариф 2000|2000 МБ на місяць за 35 грн,позатарифно: 1Мб = 0.04грн");
        System.out.println("Тариф номер 3|Тариф 5000|5000 МБ на місяць за 85 грн,позатарифно: 1Мб = 0.02грн");
        System.out.print("Введіть номер тарифу:");
        int numberTariff = in.nextInt();
        System.out.print("Введіть кількість витрачених МБ:");
        int valueMegaBytes = in.nextInt();
        switch (numberTariff) {
            case 1:
                System.out.println("Ви обрали тариф 1000.");
                if (valueMegaBytes < 1000) {
                    System.out.println("До сплати 20грн.");
                } else {
                    double overValue = ((valueMegaBytes - 1000) * 0.05) + 20;
                    System.out.printf("До сплати %.2f грн.\n", overValue);
                    System.out.println("Якби ви перейшли на більш дорогі тарифи сума за витрачені МБ становила б:");
                    double tariff_one = ((valueMegaBytes - 2000) * 0.04) + 35;
                    double tariff_three = ((valueMegaBytes - 5000) * 0.02) + 85;
                    System.out.println("Тариф 2000:" + tariff_one + "грн");
                    System.out.println("Тариф 5000:" + tariff_three + "грн");
                }
                break;
            case 2:
                System.out.println("Ви обрали тариф 2000.");
                if (valueMegaBytes < 2000) {
                    System.out.println("До сплати 35грн.");
                } else {
                    double overValue = ((valueMegaBytes - 2000) * 0.04) + 35;
                    System.out.printf("До сплати %.2f грн.\n", overValue);
                    System.out.println("Якби ви перейшли на більш дорогі тарифи сума за витрачені МБ становила б:");
                    double tariff_three = ((valueMegaBytes - 5000) * 0.02) + 85;
                    System.out.println("Тариф 5000:" + tariff_three + "грн");
                }
                break;
            case 3:
                System.out.println("Ви обрали тариф 5000");
                if (valueMegaBytes < 5000) {
                    System.out.println("До сплати 85грн.");
                } else {
                    double overValue = ((valueMegaBytes - 5000) * 0.02) + 85;
                    System.out.printf("До сплати %.2f грн.\n", overValue);
                }
                break;
            default:
                System.out.println("Ви не обрали номер тарифу!");
                break;
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
