package lecture23;

import lecture24.DeveloperType;

abstract public class Developer {
    protected final int salary;
    protected final int yearsInDev;
    protected final DeveloperType type;
    protected Developer(int salary, int yearsInDev, DeveloperType type) {
        this.salary = salary;
        this.yearsInDev = yearsInDev;
        this.type = type;
    }

    abstract public void solveTask();
    public DeveloperType getType(){
        return type;
    }
    @Override
    public String toString(){
        return "Dev: " + getClass().getSimpleName() + ", experience: " + yearsInDev + ", salary: " + salary;
    }
}
