package Ex_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test {
    public static void main(String[] args) {
        TimerTask timerTask = new MyTimerTask();
        Timer timer = new Timer(true);
        timer.schedule(timerTask,0,1000);
        System.out.println("TimerTask почав своє виконання.");
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask закончив своє виконання.");
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
