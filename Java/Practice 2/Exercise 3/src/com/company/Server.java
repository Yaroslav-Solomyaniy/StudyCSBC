package com.company;

import java.util.Scanner;

public class Server {

    boolean[] firstClass = new boolean[5];
    boolean[] economyClass = new boolean[5];
    int numFirstClass = 0;
    int numEconomyClass = 0;
    Scanner scan = new Scanner(System.in);

    public void book(){
        System.out.println("Оберіть 1 чи 2 клас:");
        int choice = scan.nextInt();
        if (choice == 1)
            economyClass();
        else if (choice == 2)
            firstClass();
        else
            System.out.println("Неправильний вибір");
    }

    private void firstClass(){
        if (numFirstClass < 5){
            for (int i = 0; i < firstClass.length; i++){
                if(!firstClass[i]){
                    firstClass[i] = true;
                    System.out.println("Перший клас. Номер місця : "+(i+1));
                    numFirstClass++;
                    break;
                }
            }
        }
        else if (numEconomyClass < 5){
            System.out.println("Більше немає 1-го класу. Натисніть 1, якщо ви хочете забронювати квиток економ-класу.");
            int choice = scan.nextInt();
            if (choice == 1)
                economyClass();
            else
                System.out.println("Наступний рейс відправляється через 3 години.");
        }
        else
            System.out.println("Усі місця заброньовані, наступний рейс відправляється через 3 години.");
    }

    private void economyClass(){
        if (numEconomyClass < 5){
            for (int i = 0; i < economyClass.length; i++){
                if(!economyClass[i]){
                    economyClass[i] = true;
                    System.out.println("Економ клас, номер місця: "+(i+6));
                    numEconomyClass++;
                    break;
                }
            }
        }
        else if (numFirstClass < 5){
            System.out.println("Більше немає економ місць. Натисніть 1, якщо ви хочете забронювати квиток першого класу.");
            int choice = scan.nextInt();
            if (choice == 1)
                firstClass();
            else
                System.out.println("Наступний рейс відправляється через 3 години.");
        }
        else
            System.out.println("Усі місця заброньовані, наступний рейс відправляється через 3 години.");
    }
}
