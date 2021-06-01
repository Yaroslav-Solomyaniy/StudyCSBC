package ex_8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть довжину кімнати: ");
        float length = input.nextFloat();
        System.out.println("Введіть ширину кімнати: ");
        float width = input.nextFloat();
        System.out.println("Введіть висоту кімнати: ");
        float height = input.nextFloat();
        float window = 1.6F * 1.2F;
        float door = 2.2F * 1.2F;
        float roomSquare = 0F;
        float sum = 0;

        if(length < (1.6 * 2) || width < 2 || height < 2.5){
            System.out.println("Були введені недопустимі значення! ");
        }
        else {
            roomSquare = roomSquare + (length * width * height) - ((2 * window) + door);
        }

        float paint = roomSquare * 0.12F;
        int paint0_5L = 0;
        int paint1L = 0;
        int paint2L = 0;
        System.out.println("Необхідний об'єм фарби - " + paint + "л\n");

        while ( paint > 0){
            if(paint >= 2){
                paint = paint - 2;
                paint2L++;
                sum += 240;
            }
            else if(paint < 2 && paint > 0.5){
                paint = paint - 1;
                paint1L++;
                sum += 125.20F;
            }
            else {
                paint = paint - 0.5F;
                paint0_5L++;
                sum += 65.80F;
            }
        }
        System.out.println("Для фарбування кімнати необхідно:\n" +
                "Загальна сума витрат: " + sum + "грн" +"\n" +
                "Фарба об'ємом 2л - " + paint2L + "\n" +
                "Фарба об'ємом 1л - " + paint1L + "\n" +
                "Фарба об'ємом 0.5л - " + paint0_5L + "\n");
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
