package it_company_1.task.task_callback;

import it_company_1.task.Task;
import it_company_1.task.TaskFactory;

public class CallbackImpl implements TaskProgressCallback {

    protected final TaskFactory taskFactory;

    public CallbackImpl(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }

    @Override
    public void updateTask(Task task) {
        taskFactory.updateTask(task);
    }
}
