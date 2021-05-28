package ex_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    public static void main(String[] args) {
        Device Tempery = new Device();
        Device Presure = new Device();
        Sensor temperature = new Sensor(Tempery,"Датчик температури");
        Sensor presure = new Sensor(Presure, "Датчик тиску");
        temperature.start();
        presure.start();
        boolean isActive = true;
            while (isActive) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (temperature.getValue() > 70) {
                    System.out.println("Датчик температури на критичному рівні. Датчик вимкнувся.");
                    temperature.interrupt();
                    presure.interrupt();
                    isActive = false;
                }
                if (presure.getValue() > 100) {
                    System.out.println("Датчик тиску на критичному рівні. Датчик вимкнувся.");
                    presure.interrupt();
                    temperature.interrupt();
                    isActive = false;
                }
        }
        try {
            Thread.sleep(10000);
            System.out.println("Пристрої вимкнуті. Контролер завершив роботу");
            printTimeStamp();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}