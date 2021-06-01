package Ex_7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class CarWashUser {

    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        Scanner in = new Scanner(System.in);
        int nextArrivalTime;

        while (true){
            System.out.println("Please enter the next arrival time" +
                    " or 999 to quit");
            nextArrivalTime = in.nextInt();
            if (nextArrivalTime == 999)
                break;
            carWash.process(nextArrivalTime);
        }
        carWash.finishUp();
        System.out.println("\nHere are the results of the simulation: ");
        LinkedList<String> results = carWash.getResults();
        for (String s: results)
            System.out.println(s);
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