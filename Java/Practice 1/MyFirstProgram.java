import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFirstProgram {
    public static void main(String args[]) {
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
