package lecture25_homework;

public abstract class Employee implements SolveTheTask {
    private final String name;
    private final int age;
    private final TypeOfEmployee type;
    private final ClassificationOfDeveloper rank;

    protected Employee(String name, int age, TypeOfEmployee type, ClassificationOfDeveloper rank) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.rank = rank;
    }
    @Override
    public abstract Task solveTask(Task task);

    @Override
    public boolean canSolveTask(Task task){
        boolean result = false ;
        if (task.checkStatus() == Status.DONE) {
            System.out.println("Task is done. Nothing to do!");
        }
        else if  (rank == ClassificationOfDeveloper.SENIOR ||
                rank == ClassificationOfDeveloper.MIDDLE && task.complexity() != Complexity.HARD ||
                rank == ClassificationOfDeveloper.JUNIOR && task.complexity() == Complexity.EASY
        ){
            result = true;
        }
        else {
            System.out.println("This " + rank + " " +getClass().getSimpleName() +
                    " can`t solve this " + task.complexity().toString().toLowerCase() + " task");
        }
        return result;
    }

}
