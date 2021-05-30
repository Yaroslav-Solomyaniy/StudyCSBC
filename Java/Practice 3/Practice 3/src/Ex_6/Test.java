package Ex_6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("\nMade by: " + sname + " on " + dateFormat.format(currentDate));
    }
    public static void main(String[] args)
    {
        printTimeStamp();
        Movable m1 = new MovableRectangle(0, 0, 50, 50, 10, 10);     // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableRectangle(20, 20, 80, 80, 5, 5); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);


    }
}
