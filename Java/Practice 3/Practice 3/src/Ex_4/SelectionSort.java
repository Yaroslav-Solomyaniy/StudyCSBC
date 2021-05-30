package Ex_4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectionSort
{
    public static void main(String[] args)
    {
        Integer[] list = {28, 77, 43, 11, 55, 9, 1};
        System.out.println("Оригінальний масив: ");
        printArray(list);

        selectionSort(list);
        System.out.println("\nСортування вибіркою:");
        printArray(list);
        selectionSort(list);
        printTimeStamp();
    }
    public static <T extends Comparable<T>> void selectionSort(T[] list)
    {
        for(int i=0; i<list.length-1; i++)
        {
            int iSmallest = i;

            for(int j=i+1; j<list.length; j++)
            {
                if(list[iSmallest].compareTo((list[j])) > 0  )
                {
                    iSmallest = j;
                }
            }
            T iSwap = list[iSmallest];
            list[iSmallest] = list[i];
            list[i] = iSwap;

        }
    }

    public static <T> void printArray(T[] list)
    {

        for(int i=0; i<list.length; i++)
        {
            System.out.print(list[i] + ", ");
        }
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("\nMade by: " + sname + " on " + dateFormat.format(currentDate));
    }
}