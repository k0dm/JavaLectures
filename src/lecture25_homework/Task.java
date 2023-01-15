package lecture25_homework;

public abstract class Task {
    protected final Complexity complexity;
    protected final String description;
    protected final Status status;

    protected Task(Complexity complexity, String description) {
        this.complexity = complexity;
        this.description = description;
    }
}
