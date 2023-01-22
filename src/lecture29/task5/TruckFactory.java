package lecture29.task5;

import java.util.*;

public class TruckFactory implements Observable {
    private final Timer timer;
    private final List<Truck> queueOfTrucks;
    private final List<Observer> observers;
    private int count;

    public TruckFactory() {
        timer = new Timer();
        queueOfTrucks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void start() {
        Random random = new Random();
        int delay = random.nextInt(6) + 2;

        timer.schedule(new MyTimerTask(), delay * 1000);
    }

    public void removeTruckFromQueue(Truck truck) {
        queueOfTrucks.remove(truck);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remoteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            if (!observer.isBusy()) {
                for (Truck truck : queueOfTrucks) {
                    if (!truck.isUnloading()) {
                        observer.unloadTheTruck(truck);
                        break;
                    }
                }
            }
        }

    }

    private final class MyTimerTask extends TimerTask {

        @Override
        public void run() {
            Random random = new Random();
            int delay = random.nextInt(6) + 2;
            Truck truck = new Truck(count++, (1 + random.nextInt(11)) * 10);

            queueOfTrucks.add(truck);
            System.out.println("New " + truck + " arrived!");

            notifyObservers();
            if (count < 10) {
                timer.schedule(new MyTimerTask(), delay * 1040);
            }

        }
    }
}
