package Ex_2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ex_2 {
    public static void main(String[] args) {

        System.out.println("Normal...");

        List<String> alpha = getData();
        alpha.stream().forEach(System.out::println);

        System.out.println("Parallel...");

        List<String> alpha2 = getData();
        alpha2.parallelStream().forEach(System.out::println);
        printTimeStamp();

    }
    private static List<String> getData() {

        List<String> alpha = new ArrayList<>();

        int n = 97;  // 97 = a , 122 = z
        while (n <= 122) {
            char c = (char) n;
            alpha.add(String.valueOf(c));
            n++;
        }
        return alpha;
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }

}
