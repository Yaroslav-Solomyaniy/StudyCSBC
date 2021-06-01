package Ex_5;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CookingBurger implements Runnable {
    final private CyclicBarrier cb;
    final private String message;
    private float timeBurger;
    private boolean isEnd;

    public CookingBurger(CyclicBarrier cb, String message) {
        this.cb = cb;
        this.message = message;
        new Thread(this).start();
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println(this.message);
        try {
            Thread.sleep(8000);
            System.out.println("Приготування бургеру завершено.");
            this.cb.await();
        } catch (BrokenBarrierException | InterruptedException ex) {
            System.out.println(ex);
        }
        long stop = System.currentTimeMillis();
        timeBurger = ((stop - start) / 1000f);
        System.out.println("Час приготування бургера: " + timeBurger + " секунд.");

        setEnd(true);
    }

    public float getTimeBurger() {
        return timeBurger;
    }

    public boolean isEnd() {

        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}