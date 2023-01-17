package lecture28;

import lecture26.Task;

public interface TaskProgressCallback {

    void updateTask(Task oldTask, Task newTask);
}
