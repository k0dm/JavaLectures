package lecture25_homework;

public class Programmer extends Employee {


    protected Programmer(String name, int age, ClassificationOfDeveloper rank) {
        super(name, age, TypeOfEmployee.PROGRAMMER, rank);
    }

    @Override
    public Task solveTask(Task task) {
        Task curTask = task;
        if(canSolveTask(task)){
            curTask = new ProgramTask(task, Status.READY_TO_TEST, TypeOfEmployee.PROGRAMMER);
        }
        return curTask;
    }

}
