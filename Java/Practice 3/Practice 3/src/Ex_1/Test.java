package Ex_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test
{
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray)
            System.out.printf("%s ", element);
    }

    public static void main(String args[]) {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println("Array integerArray contains:");
        printArray(integerArray);
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);
        System.out.println("\nArray characterArray contains:");
        printArray(characterArray);
        printTimeStamp();
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("\nMade by: " + sname + " on " + dateFormat.format(currentDate));
    }
}