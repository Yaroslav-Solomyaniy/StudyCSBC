package Ex_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args)
    {
        System.out.println("Введіть текст:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        TreeSet<String> tree = new TreeSet<String>();
        String[] splitText = text.split(" ");

        for(int i = 0;i < splitText.length;i++)
        {
            tree.add(splitText[i]);
        }
        System.out.println(tree);
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
