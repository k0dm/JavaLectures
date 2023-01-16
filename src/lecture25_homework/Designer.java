package lecture25_homework;

public class Designer extends Employee implements CreateNewTask {

    protected Designer(String name, int age, ClassificationOfDeveloper rank) {
        super(name, age, TypeOfEmployee.DESIGNER, rank);
    }

    @Override
    public Task solveTask(Task task) {
        Task curTask = task;

        if(canSolveTask(task)){
            curTask = new DesignTask(task, Status.READY_TO_TEST, TypeOfEmployee.DESIGNER);
        }
        return curTask;
    }

    @Override
    public Task createTask(Complexity complexity, String description, Status status) {

        return new ProgramTask(complexity, description, status);
    }


}
