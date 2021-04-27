package Ex_7;

import java.util.LinkedList;
import java.util.Queue;

public class CarWash {
    final int MAXSIZE = 5;
    final int WASHTIME = 10;
    final int INFINITY = 999999999;

    protected Queue<Car> carQueue;
    protected LinkedList<String> results;
    protected int currentTime;
    protected int nextDepartureTime;
    protected int waitingTime;
    protected int sumOfWaitingTimes;
}