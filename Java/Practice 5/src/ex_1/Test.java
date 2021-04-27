package ex_1;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test{
    public static void main(String[] args)
    {
        //ArrayList = city
        ArrayList city = new ArrayList();
        city.add("Harkiv");
        city.add("Cherkassy");
        city.add("Kiev");
        //Sort.
        city.sort(Comparator.naturalOrder());
        System.out.println("City після сортування.");
        System.out.println(city);
        System.out.println("Використання Collections.shuffle.");
        Collections.shuffle(city);
        System.out.println(city);
        Collections.shuffle(city);
        System.out.println(city);
        Collections.shuffle(city);
        System.out.println(city);
        Collections.shuffle(city);
        System.out.println(city);
        //Linked List
        LinkedList city_linked = new LinkedList();
        city_linked.add("Житомир");
        city_linked.add("Донецьк");
        city_linked.add("Дніпро");
        city_linked.add("Одеса");
        Collections.sort(city_linked);
        System.out.println("City після сортування.");
        System.out.println(city_linked);
        System.out.println("Використання Collections.shuffle.");
        Collections.shuffle(city_linked);
        System.out.println(city_linked);
        Collections.shuffle(city_linked);
        System.out.println(city_linked);
        Collections.shuffle(city_linked);
        System.out.println(city_linked);
        Collections.shuffle(city_linked);
        System.out.println(city_linked);
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
