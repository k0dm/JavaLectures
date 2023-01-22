package lecture29.task4;

public interface Observable {
    void registerObserver(Observer observer);
    void remoteObserver(Observer observer);
    void notifyObservers();
}
