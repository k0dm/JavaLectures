package lecture29.task7;

import java.util.*;

public class Waiter implements Observable {

    private final int priceOfCoffee;
    private final Timer timer;
    private final Random random;
    private List<Observer> observers;


    public Waiter(int priceOfCoffee) {
        this.priceOfCoffee = priceOfCoffee;
        this.random = new Random();
        this.timer = new Timer();
        this.observers = new ArrayList<>();
    }

    public void offerACupOfCoffee() {
        timer.schedule(new TaskOffer(),getDelay());
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            if (observer.canDrinkCoffee(priceOfCoffee)) {
                observer.drinkCoffee(priceOfCoffee);
            }
        }
    }

    private class TaskOffer extends TimerTask {

        @Override
        public void run() {
            System.out.println("The waiter offers a cup of coffee");
            notifyObservers();
            timer.schedule(new TaskOffer(), getDelay());

        }
    }

    private int getDelay() {
        return (2 + random.nextInt(5)) * 1000;
    }
}
