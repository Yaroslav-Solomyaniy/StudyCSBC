package Ex_5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CookingCola implements Runnable{
    final private CyclicBarrier cb;
    final private String message;

    public CookingCola(CyclicBarrier cb, String message) {
        this.cb = cb;
        this.message = message;
        new Thread(this).start();
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println(this.message);
        try {
            Thread.sleep(10000);
            System.out.println("Приготування коли завершено");
            this.cb.await();
        }
        catch (BrokenBarrierException | InterruptedException ex)
        {
            System.out.println(ex);
        }
        long stop = System.currentTimeMillis();
        float time_cola = ((stop-start)/1000f);
        System.out.println("Час приготування коли: "+ time_cola + " секунд");
    }
}
