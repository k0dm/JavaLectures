package lecture29.task5;

public interface Observable {
    void registerObserver(Observer observer);
    void remoteObserver(Observer observer);
    void notifyObservers();
}
