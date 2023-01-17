package lecture28;

import lecture26.Task;


public class CallbackImpl implements TaskProgressCallback {

    private final TaskFactory taskFactory;

    public CallbackImpl(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }

    @Override
    public void updateTask(Task oldTask, Task newTask) {
        taskFactory.updateTask(oldTask, newTask);
    }
}
