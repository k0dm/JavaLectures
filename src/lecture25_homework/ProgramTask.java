package lecture25_homework;

public class ProgramTask extends Task {
    protected ProgramTask(Complexity complexity, String description, Status status) {
        super(complexity, description, status, TypeOfEmployee.PROGRAMMER);
    }

    protected ProgramTask(Task task, Status status, TypeOfEmployee typeOfTask) {
        super(task, status, typeOfTask);
    }
}
