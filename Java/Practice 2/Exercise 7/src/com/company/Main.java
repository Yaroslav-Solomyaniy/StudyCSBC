package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String args[])
    {
        int m, n, p, q, sum = 0, c, d, k;

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть кількість рядків та стовпців в першій матриці");
        m = in.nextInt();
        n = in.nextInt();

        int first[][] = new int[m][n];

        System.out.println("Введіть елементи першої матриці:");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c][d] = in.nextInt();

        System.out.println("Введіть кількість рядків та стовпців в другій матриці");
        p = in.nextInt();
        q = in.nextInt();

        if (n != p)
            System.out.println("Дані матриці не можливо перемножити!");
        else
        {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q];

            System.out.println("Введіть елементи другої матриці");

            for (c = 0; c < p; c++)
                for (d = 0; d < q; d++)
                    second[c][d] = in.nextInt();

            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++) {
                    for (k = 0; k < p; k++)
                        sum = sum + first[c][k]*second[k][d];

                    multiply[c][d] = sum;
                    sum = 0;
                }
            }

            System.out.println("Добуток матриць:");

            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++)
                    System.out.print(multiply[c][d]+"\t");

                System.out.print("\n");
            }
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
