package Ex_5;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CookingPotatoes implements Runnable{
    final private CyclicBarrier cb;
    final private String message;

    public CookingPotatoes(CyclicBarrier cb, String message) {
        this.cb = cb;
        this.message = message;
        new Thread(this).start();
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println(this.message);
        try {
            Thread.sleep(7000);
            System.out.println("Приготування картошки фрі завершено");
            this.cb.await();
        }
        catch (BrokenBarrierException | InterruptedException ex)
        {
            System.out.println(ex);
        }
        long stop = System.currentTimeMillis();
        float time_free = ((stop-start)/1000f);
        System.out.println("Час приготування картошки фрі: "+ time_free + " секунд");
    }
}
