package lecture23;

import lecture24.DeveloperType;

public class Junior extends Developer {
    protected Junior(int salary, int yearsInDev) {
        super(salary, yearsInDev, DeveloperType.JUNIOR);
    }

    @Override
    public void solveTask() {

    }

}
