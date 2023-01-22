package lecture29.task5;

import java.util.Timer;
import java.util.TimerTask;

public class Unloader implements Observer{
    private final int id;
    private boolean isBusy;
    private final int capacityPerSecond;
    private final TruckUnloadCallback truckUnloadCallback;
    private final NotifyUnloaderCallback notifyUnloaderCallback;

    public Unloader(int id, int capacityPerSecond, TruckUnloadCallback callback, NotifyUnloaderCallback notifyUnloaderCallback) {
        this.id = id;
        this.capacityPerSecond = capacityPerSecond;
        this.truckUnloadCallback = callback;
        this.notifyUnloaderCallback = notifyUnloaderCallback;
        this.isBusy = false;
    }

    public void unloadTheTruck(Truck truck){
        System.out.println("Unloader "+id+" start unloading " + truck);
        truck.unload();
        isBusy = true;

        TimerTask finishUnload = new TimerTask() {
            @Override
            public void run() {
                truckUnloadCallback.finishUnload(truck);
                isBusy = false;
                System.out.println("The unloader "+id+" has finished unloading " + truck);
                notifyUnloaderCallback.notifyObservers();
            }
        };
        Timer timer = new Timer();
        timer.schedule(finishUnload,truck.getCapacity()* 100);
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean isBusy() {
        return isBusy;
    }


}
