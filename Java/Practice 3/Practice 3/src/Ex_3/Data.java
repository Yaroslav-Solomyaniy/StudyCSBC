package Ex_3;
public class Data {
    public static void main(String[] args) {
        Employee[] SuperEmployee =
                {
                        new Employee("Yarik",5250),
                        new Employee("Stanislav",5000)
                };
        double temp = average(SuperEmployee);
        System.out.println(temp);
    }
    public static double average(Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0)
        {
            return sum / objects.length;
        }
        else
        {
            return 0;
        }
    }
    public static String largest(Measurable[] objects)
    {
        if (objects.length == 0)
        {
            return null;
        }
        String name = "";
        for(Measurable obj : objects)
        {
            
        }
    }
}