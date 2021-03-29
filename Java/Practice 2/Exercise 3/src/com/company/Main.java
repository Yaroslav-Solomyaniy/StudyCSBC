package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    static boolean running = true;

        public static void main(String[] args) {
            Server tickets = new Server();
            Scanner scan = new Scanner(System.in);
            while(running){
                tickets.book();
                System.out.println("Введіть \"Quit\", щоб вийти, або будь-яку клавішу, щоб продовжити.");
                String quit = scan.next();
                if (quit.equalsIgnoreCase("Quit"))
                    running = false;
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
