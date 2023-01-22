package lecture29.task5;

public class Truck {
    private final int id;
    private final int capacity;
    private  boolean isUnloading;


    public Truck(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.isUnloading = false;
    }
    public void unload(){
        isUnloading = true;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isUnloading() {
        return isUnloading;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", capacity=" + capacity +
                "}";
    }

}
