package lecture25_homework;

public abstract class Worker {
    protected final String name;
    protected final int age;
    protected final ClassificationOfDeveloper rank;
    protected final boolean hasEducation;

    protected Worker(String name, int age, ClassificationOfDeveloper rank, boolean hasEducation) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.hasEducation = hasEducation;
    }

    abstract void solveTask(Task task);

}
