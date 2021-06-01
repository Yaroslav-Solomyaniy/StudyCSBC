import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        while (true)
        {
            try
            {
                System.out.println("Введіть індекс з масиву: ");
                Scanner sc = new Scanner(System.in);
                int ind = sc.nextInt();
                System.out.println(array(ind));
                break;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Out of Bounds");
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
    public static int array(int ind)
    {
        int[] array1 = new int[100];
        for (int i=0;i<100;++i)
        {
            int a = 0;
            int b = 120;
            array1[i] = (int)( Math.random() * (b-a) ) + a;
        }
        return array1[ind];
    }
}
