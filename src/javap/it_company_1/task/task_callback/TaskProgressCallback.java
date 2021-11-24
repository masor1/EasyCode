package javap.it_company_1.task.task_callback;

import javap.it_company_1.task.Task;

public interface TaskProgressCallback {
    void updateTasks(Task oldTask, Task newTask);
}
