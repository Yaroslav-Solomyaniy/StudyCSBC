package Ex_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.IntStream;

public class ex_3 {
    public static void main(String[] args) {

        System.out.println("Normal...");

        IntStream range = IntStream.rangeClosed(1, 10);
        System.out.println(range.isParallel());         // false
        range.forEach(System.out::println);

        System.out.println("Parallel...");

        IntStream range2 = IntStream.rangeClosed(1, 10);
        IntStream range2Parallel = range2.parallel();
        System.out.println(range2Parallel.isParallel()); // true
        range2Parallel.forEach(System.out::println);
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
