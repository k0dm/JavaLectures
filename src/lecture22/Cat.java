package lecture22;

public class Cat extends Animal{

    protected Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
       System.out.println("Rav rav myr myr");
    }

}
