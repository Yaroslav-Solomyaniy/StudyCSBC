package Ex_5;

import java.util.concurrent.CyclicBarrier;

public class McDonals {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3,new Order());
        System.out.println("Початок приготування замовлення.");
        new CoockingBurger(cb,"Приготування бургеру");
        new CookingCola(cb,"Приготування коли");
        new CookingPotatoes(cb,"Приготування картошки фрі");
    }
}
