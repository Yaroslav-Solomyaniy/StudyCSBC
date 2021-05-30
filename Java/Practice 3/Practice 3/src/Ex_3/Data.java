package Ex_3;
public class Data {
    public static void main(String[] args) {
        Employee[] SuperEmployee =
                {
                        new Employee("Yarik",5250),
                        new Employee("Stanislav",5000)
                };
        double temp = average(SuperEmployee);
        System.out.println(largest(SuperEmployee.);
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
    public static Measurable largest(Measurable[] objects)
    {
        if (objects.length == 0)
        {
            return null;
        }
        Measurable largestSoFar = objects[0];
        for (int i = 1; i < objects.length; i++)
        {
            Measurable current = objects[i];
            if (current.getMeasure() > largestSoFar.getMeasure())
            {
                largestSoFar = current;
            }
        }
        return largestSoFar;
    }
}