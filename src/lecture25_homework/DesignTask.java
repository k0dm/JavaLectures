package lecture25_homework;

public class DesignTask extends Task{
    protected DesignTask(Complexity complexity, String description, Status status) {
        super(complexity, description, status, TypeOfEmployee.DESIGNER);
    }

    protected DesignTask(Task task, Status status, TypeOfEmployee type) {
        super(task, status,TypeOfEmployee.DESIGNER);
    }
}
