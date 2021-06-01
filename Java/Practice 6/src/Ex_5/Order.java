package Ex_5;
public class Order implements Runnable {

    @Override
    public void run() {
        System.out.println("Ваш заказ успішно виконано.");
    }
}
