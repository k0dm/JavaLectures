package lecture29.task7;

import java.util.Timer;
import java.util.TimerTask;

public class Guest implements Observer {
    private final int id;
    private int money;
    private int numOfCupsOfCoffeeDrunk;
    private boolean drinkСoffee;

    public Guest(int id, int money) {
        this.id = id;
        this.money = money;

    }

    @Override
    public boolean canDrinkCoffee(int price) {

        return price <= money && numOfCupsOfCoffeeDrunk < 2 && !drinkСoffee;
    }

    @Override
    public void drinkCoffee(int price) {
        System.out.println("Guest id=" + id + " start drinking a cup of coffee.");
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                drinkСoffee = false;
                numOfCupsOfCoffeeDrunk++;
                System.out.println("Guest id=" + id + " finished drinking a cup of coffee.");

            }
        };
        money -= price;
        drinkСoffee = true;
        timer.schedule(timerTask, 5000);
    }

    @Override
    public String toString() {
        return "Guest{id=" + id +
                ", numOfCupsOfCoffeeDrunk=" + numOfCupsOfCoffeeDrunk +
                ", drinkCoffee=" + drinkСoffee +
                "}";
    }
}
