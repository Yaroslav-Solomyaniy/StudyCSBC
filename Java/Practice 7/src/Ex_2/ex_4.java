package Ex_2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex_4 {
    public static void main(String[] args) {

        long count = Stream.iterate(0, n -> n + 1)
                .limit(1_000_000).parallel()
                .filter(ex_4::isPrime)
                .peek(x -> System.out.format("%s\t", x))
                .count();
        System.out.println("\nTotal: " + count);
        printTimeStamp();
    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }

}
