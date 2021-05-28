package Ex_2;

import java.awt.*;
import java.util.TimerTask;
public class MyTimerTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("Я TimerTask, включив звук бипера.");
        Toolkit.getDefaultToolkit().beep();
    }
}
