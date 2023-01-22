package lecture29.task5;

public class Main {
    public static void main(String[] args) {
        TruckFactory factory = new TruckFactory();
        TruckUnloadCallback truckUnloadCallback = factory::removeTruckFromQueue;
        NotifyUnloaderCallback notifyUnloaderCallback = factory::notifyObservers;
        Unloader unloader1 = new Unloader(1, 10,truckUnloadCallback, notifyUnloaderCallback);
        Unloader unloader2 = new Unloader(2, 15,truckUnloadCallback, notifyUnloaderCallback);

        factory.registerObserver(unloader1);
        factory.registerObserver(unloader2);

        factory.start();
    }
}
