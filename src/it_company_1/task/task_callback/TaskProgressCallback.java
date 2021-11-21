package it_company_1.task.task_callback;

import it_company_1.task.Task;

public interface TaskProgressCallback {
    void updateTasks(Task oldTask, Task newTask);
}
