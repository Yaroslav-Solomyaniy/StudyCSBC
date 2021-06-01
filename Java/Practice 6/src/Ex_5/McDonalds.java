package Ex_5;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CyclicBarrier;

public class McDonalds {
    public static void main(String[] args) {

        CyclicBarrier cb = new CyclicBarrier(3, new Order());

        System.out.println("Початок приготування замовлення.");

        CookingBurger burger = new CookingBurger(cb, "Приготування бургеру...");
        CookingCola cola = new CookingCola(cb, "Приготування коли...");
        CookingPotatoes fries = new CookingPotatoes(cb, "Приготування картошки фрі...");

        while (true) {
            if (burger.isEnd() && cola.isEnd() && fries.isEnd()) {
                System.out.printf("Час виконання замовлення : %.3f %s",
                        getMax(burger.getTimeBurger(),cola.getTimeCola(),fries.getTimeFree()), " seconds.");
                break;
            } else {
                System.out.print("");
            }
        }
        printTimeStamp();
    }
    public static double getMax(double a, double b, double c){
        return a > b ? (a > c ?  a : c) : (b > c ? b : c);
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("\nMade by: " + sname + " on " + dateFormat.format(currentDate));
    }
}