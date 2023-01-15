package lecture23;

public class DeveloperFactory {
    public Developer create(int yearsInDev,int salary){
        return switch (yearsInDev){
            case 1 -> new Junior( salary, yearsInDev);
            case 2 -> new Middle( salary, yearsInDev);
            case 3 -> new Senior( salary, yearsInDev);
            default -> throw new IllegalArgumentException("Wrong arguments");
        };
    }
}
