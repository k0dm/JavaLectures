package lecture25_homework;

public class Tester extends Employee{
    protected Tester(String name, int age, ClassificationOfDeveloper rank) {
        super(name, age, TypeOfEmployee.TESTER, rank);
    }


    @Override
    public Task solveTask(Task task) {
        Task curTask = task;
        if(canSolveTask(task)){
            if(task.getTypeOfTask() == TypeOfEmployee.DESIGNER){
                curTask = new DesignTask(task,Status.DONE,TypeOfEmployee.DESIGNER);
            }else if(task.getTypeOfTask() == TypeOfEmployee.PROGRAMMER){
                curTask = new DesignTask(task,Status.DONE,TypeOfEmployee.PROGRAMMER);
            }
        }
        return curTask;
    }
}
