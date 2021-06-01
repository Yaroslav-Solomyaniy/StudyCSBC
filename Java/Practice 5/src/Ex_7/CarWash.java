package Ex_7;

import java.util.LinkedList;
import java.util.Queue;

public class CarWash {

    public final static String OVERFLOW = " (Overflow) ";
    public final static String HEADING
            = "\n\nTime\tEvent\tWaiting Time\n";
    public final static int MAX_SIZE = 5;
    public final static int WASH_TIME = 10;
    public final static int INFINITY = 10000;
    private Queue<Car> carQueue;
    private LinkedList<String> results;
    private int waitingTime;
    private int sumOfWaitingTimes;
    private int numberOfCars;
    private int currentTime;
    private int nextDepartureTime;

    public CarWash(){
        carQueue = new LinkedList<Car>();
        results = new LinkedList<String>();
        results.add(HEADING);
        currentTime = 0;
        numberOfCars = 0;
        waitingTime = 0;
        sumOfWaitingTimes = 0;
        nextDepartureTime = INFINITY;
    } //

    public LinkedList<String> process(int nextArrivalTime){
        if (nextArrivalTime < currentTime)
            throw new IllegalArgumentException
                    ("The next arrival cannot occur before current time");
        while (nextArrivalTime >= nextDepartureTime)
            processDeparture();
        return processArrival(nextArrivalTime);
    }

    public LinkedList<String> processArrival(int nextArrivalTime){

        currentTime = nextArrivalTime;
        if(carQueue.size() == MAX_SIZE)
            results.add(Integer.toString(currentTime) + "\tArrival" +
                    OVERFLOW);
        else
        {
            results.add(Integer.toString(currentTime) + "\tArrival");
            numberOfCars++;
            if (nextDepartureTime == INFINITY)
                nextDepartureTime = currentTime + WASH_TIME;
            else
                carQueue.add(new Car(nextArrivalTime));
        }
        return results;
    }

    public LinkedList<String> processDeparture(){
        final String DEPARTURE = "\tDeparture\t\t";
        int arrivalTime;

        currentTime = nextDepartureTime;
        results.add(Integer.toString(currentTime) + DEPARTURE +
                Integer.toString(waitingTime) );
        if (!carQueue.isEmpty()){
            Car car = carQueue.remove();
            arrivalTime = car.getArrivalTime();
            waitingTime = currentTime - arrivalTime;
            sumOfWaitingTimes += waitingTime;
            nextDepartureTime = currentTime + WASH_TIME;
        }
        else {
            waitingTime = 0;
            nextDepartureTime = INFINITY;
        }
        return results;
    }

    public LinkedList<String> finishUp() {
        while (nextDepartureTime < INFINITY){
            processDeparture();
        }
        return results;
    }

    public LinkedList<String> getResults() {
        if (numberOfCars == 0)
            results.add("There were no cars in the car wash.");
        else
            results.add("\n\nThe average waiting time in minutes was "
                    + Double.toString((double) sumOfWaitingTimes / numberOfCars));
        return results;
    }

}