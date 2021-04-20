package Ex_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        Furniture robe = new BookCase(2.4,3.2,4.2,"Шкафа першого типу",1,5);
        robe.cost(2.4,3.2,4.2,1,5);
        System.out.println(robe);
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
