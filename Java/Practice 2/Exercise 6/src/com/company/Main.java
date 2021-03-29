package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String text = "Years later, we would have mortgages, car payments, and life insurance, \n" +
                "but no recollection of when we all dropped acid together in the high desert after graduation.\n";
        System.out.println("Заданий текст: " + text);
        char[] code = {'a','b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] codeChange = {'d', 'y', 'p', 'r', 'i', 'a', 'j', 'u', 'h', 't', 'q',
                'w', 'e', 's', 'f', 'o', 'v', 'c', 'n', 'b', 'l', 'x', 'm', 'k', 'z', 'g'};
        char[] temp = text.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (temp[i] == code[j]) {
                    temp[i] = codeChange[j];
                    break;
                }
            }
        }
        text = String.copyValueOf(temp);
        System.out.println("Зашифрований текст: " + text);

        //Description
        char[] temp_two = text.toCharArray();
        for(int m = 0;m<temp_two.length;m++)
        {
            for(int k=0;k<codeChange.length;k++)
            {
             if(temp_two[m] == codeChange[k])
             {
                 temp_two[m] = code[k];
                 break;
             }
            }
        }
        text = String.copyValueOf(temp_two);
        System.out.println("Розшифрований текст: " + text);
        printTimeStamp();
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
