package ex_6;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    static Semaphore semaphore = new Semaphore(4);
    public static void main(String[] args) {
        printTimeStamp();
        System.out.println("Total available Semaphore permits : "+ semaphore.availablePermits());
        People p1 = new People("A");
        p1.start();
        People p2 = new People("B");
        p2.start();
        People p3 = new People("C");
        p3.start();
        People p4 = new People("D");
        p4.start();
        People p5 = new People("E");
        p5.start();
        People p6 = new People("F");
        p6.start();
    }
    static class People extends Thread {
        String name = "";
        People(String name) {
            this.name = name;
        }
        public void run() {
            try {
                System.out.println(name + " : acquiring lock...");
                System.out.println(name + " : available Semaphore permits now: " + semaphore.availablePermits());
                semaphore.acquire();
                System.out.println(name + " : got the permit!");
                try {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(name + " : is performing operation " + i + ", available Semaphore permits : "+ semaphore.availablePermits());
                        Thread.sleep(1000);
                    }
                } finally {
                    System.out.println(name + " : releasing lock...");
                    semaphore.release();
                    System.out.println(name + " : available Semaphore permits now: "+ semaphore.availablePermits());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}