package Ex_1;

public class ThreadOne extends Thread{
    public void run()
    {
        System.out.println("Поток 1 створено.");
        try
        {
            int a = 0;
            int b = 10000;
            long randomTime = (a+(long)(Math.random()*b));
            System.out.println("Поток 1 спав: "+randomTime+" Секунд");
            Thread.sleep(randomTime);
        }
        catch (InterruptedException e) {
            System.out.println("Поток 1 перерваний");
        }
        System.out.println("Я поток 1, мій ID:"+getId());
        System.out.println("Поток  1 завершено.");
    }
}
