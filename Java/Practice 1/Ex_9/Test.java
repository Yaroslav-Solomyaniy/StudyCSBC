package Ex_9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zp = 4723;
        System.out.println("Введіть розряд працівника:");
        int discharge = sc.nextInt();
        if(discharge<=24) {
            for (int i = 1; i < discharge; i++) {
                int procent = Math.round(zp*5/100);
                zp += procent;
            }
            System.out.println(discharge+" розряд отримує зарплату: "+ zp+ " грн");
            int pdv = Math.round(zp * 20/100);
            int fond = Math.round(zp * 3/100);
            int army = (int)Math.round(zp*1.5/100);
            System.out.println("ПДВ становить: "+pdv+ "грн");
            System.out.println("Виплати у пенсійний фонд:"+fond+ " грн");
            System.out.println("Військовий збір:"+army+ " грн");
            int premia = Math.round(zp*15/100);
            zp = zp - pdv-fond-army;
            System.out.println("Нарахування заробітної плати: "+ zp+ " грн");
            int avans = zp*30/100;
            int zarpl = zp*70/100;
            System.out.println("Аванс становить: "+avans+" грн");
            System.out.println("Заробітня плата становить: "+zarpl+" грн");
            System.out.println("Премія становить: "+ premia+" грн");
        }
        else
        {
            System.out.println("Невірно введений розряд працівника.");
        }
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
