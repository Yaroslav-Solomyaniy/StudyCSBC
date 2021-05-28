package ex_3;
public class Sensor extends Thread {
    Device device;
    private int value;
    private String name;

    public Sensor(Device d,String name){
        this.name = name;
        device = d;
    }
    public int getValue() {
        return value;
    }
    public void updateValue(String name){
        int a = 0;
        int b = 10;
        int number = (int)((Math.random() *(b-a))+a);
        value += number;
        System.out.println("Значення | "+ name + " | змінилось на : "+ number);
        System.out.println(name + " | показує : " + value);
    }

    @Override
    public void run()
    {
    device.startup(name);
        while (!isInterrupted()) {
            try {
                Thread.sleep(3000);
                updateValue(name);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        device.shutdown(name);
    }
}
