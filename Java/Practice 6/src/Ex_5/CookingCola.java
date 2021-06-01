package Ex_5;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CookingCola implements Runnable {
    final private CyclicBarrier cb;
    final private String message;
    private float timeCola;
    private boolean isEnd;

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
            Thread.sleep(2459);
            System.out.println("Приготування коли завершено.");
            this.cb.await();
        } catch (BrokenBarrierException | InterruptedException ex) {
            System.out.println(ex);
        }
        long stop = System.currentTimeMillis();
        timeCola = ((stop - start) / 1000f);
        System.out.println("Час приготування коли: " + timeCola + " секунд.");

        setEnd(true);
    }

    public float getTimeCola() {
        return timeCola;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}