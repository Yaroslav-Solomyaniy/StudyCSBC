import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;

public class BuyNotebook {
    public static void main(String[] args) throws IOException {
        double SumCredit = 20000;
        int IdOperation = 0;
        while (SumCredit > 0) {
            IdOperation++;
            double Procent = (SumCredit / 100 * 1.5);
            double pay = 1000 - Procent;
            System.out.printf("Виплачено кредиту з урахуванням проценту:%.1f\n", pay);
            System.out.printf("Сума процента:%.1f" + "\n", Procent);
            SumCredit = (double) SumCredit - pay;
            if (SumCredit > 0) {
                System.out.printf("Залишилось виплачувати кредиту:%.1f" + "\n", SumCredit);
            } else {
                System.out.printf("КРЕДИТ УСПІШНО ВИПЛАЧЕНО.Залишок переведено на вашу карту\n");
                System.out.println("Кількість місяців, за які виплатився кредит:" + IdOperation);
            }
            System.out.println("=======================**********============================");
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
