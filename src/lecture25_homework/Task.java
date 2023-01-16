package lecture25_homework;

import java.util.SplittableRandom;

public abstract class Task {
    private final Complexity complexity;
    private final String description;
    private final Status status;
    private final TypeOfEmployee typeOfTask;

    protected Task(Complexity complexity, String description, Status status, TypeOfEmployee typeOfTask) {
        this.complexity = complexity;
        this.description = description;
        this.status = status;
        this.typeOfTask = typeOfTask;
    }

    protected Task(Task task, Status status, TypeOfEmployee typeOfTask) {
        this(task.complexity, task.description, status, typeOfTask);
    }

    public Status checkStatus(){
        return status;
    }
     public TypeOfEmployee getTypeOfTask(){
        return  typeOfTask;
     }
    public Complexity complexity(){
        return  complexity;
    }
     @Override
     public String toString(){
        return typeOfTask + " task:\n\tcomplexity: " +
               complexity + "\n\tstatus: " + status +
                "\n\tdescription: " + description;
     }
}
