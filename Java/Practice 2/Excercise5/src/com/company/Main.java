package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть ваш код ISBN(13 цифр):");
        long number = scan.nextLong();
        int lengthNumber = numberLength(number);
        String[] splitArray = toCharArray(number);
        if (lengthNumber == 13)
        {
            int ISBN =((Integer.parseInt(splitArray[0]))*1)+((Integer.parseInt(splitArray[1]))*3)+((Integer.parseInt(splitArray[2]))*1)+((Integer.parseInt(splitArray[3]))*3)+
                    ((Integer.parseInt(splitArray[4]))*1)+((Integer.parseInt(splitArray[5]))*3)+((Integer.parseInt(splitArray[6]))*1)+((Integer.parseInt(splitArray[7]))*3)+
                    ((Integer.parseInt(splitArray[8]))*1)+((Integer.parseInt(splitArray[9]))*3)+((Integer.parseInt(splitArray[10]))*1)+((Integer.parseInt(splitArray[11]))*3);
            System.out.println("Сума добутків:"+ ISBN);
            int checkDigit = 10 -(ISBN % 10);
            System.out.println("Перевірочна цифра:"+checkDigit);
        }
        else
            {
                System.out.println("Ви ввели невірний код ISBN!!");
            }
        printTimeStamp();
    }
    public  static String[] toCharArray(Long i)
    {
        String str = "";
        str = Long.toString(i);
        String[] words = str.split("");
        return words;
    }
   public static int numberLength(long i)
    {
        String str="";
        str=Long.toString(i);
        return str.length();
    }
    public static void printTimeStamp()
    {
        final String sname = "Yaroslav Solomianiy";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("\nMade by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
