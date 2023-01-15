package lecture23;

import lecture24.DeveloperType;

public class Middle extends Developer{
    protected Middle(int salary, int yearsInDev) {
        super(salary, yearsInDev, DeveloperType.MIDDLE);
    }

    @Override
    public void solveTask() {

    }
}
