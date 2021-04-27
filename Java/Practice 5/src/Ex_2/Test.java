package Ex_2;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.String;

public class Test {
    public static void main(String[] args)
    {
        List<String> city = new ArrayList<>();
        city.add("Умань");
        city.add("Ужгород");
        city.add("Прип'ять");
        city.add("Мадрид");
        System.out.println("Список до сортування:");
        for (String s: city) {
            System.out.println(s);
        }
        System.out.println("Список після сортування:");
        List<String> ReverseList = reverseCopy(city);
        for (String s: ReverseList ) {
            System.out.println(s);
        }
        printTimeStamp();
    }
    public static <T> List<T> reverseCopy(List<T> list)
    {
        List<T> tempList = new ArrayList<T>();
        for(int i = list.size()-1;i >= 0;i--)
        {
            tempList.add(list.get(i));
        }
        return tempList;
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
