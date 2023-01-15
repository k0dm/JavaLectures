package lecture22;

public abstract class Animal {
    protected final String name;

    protected Animal(String name){
        this.name = name;
    }

    public abstract void move();

    @Override
    public String toString(){
        return "Animal(" + getClass().getSimpleName() + ") has name: " + name;
    }

}
