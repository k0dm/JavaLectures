package lecture23;

import lecture24.DeveloperType;

public class Senior extends Developer{
    protected Senior(int salary, int yearsInDev) {
        super(salary, yearsInDev, DeveloperType.SENIOR);
    }

    @Override
    public void solveTask() {

    }


}
