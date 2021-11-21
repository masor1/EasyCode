package it_company_1.employee;

import it_company_1.column.Column;
import it_company_1.observer.Observer;
import it_company_1.task.Task;
import it_company_1.task.task_callback.TaskProgressCallback;

public abstract class Employee implements Observer {

    private final TaskProgressCallback callback;
    private final String name;
    private final Task.Status taskStatus;

    protected Employee(TaskProgressCallback callback,
                    String name,
                    Task.Status taskStatus) {
        this.callback = callback;
        this.name = name;
        this.taskStatus = taskStatus;
    }

    @Override
    public void handleTask(Task task) {
            System.out.println(getClass().getSimpleName() + " " + name
                    + " is doing task " + getDetails(task));
            callback.updateTasks(task, getTaskWhenDone(task));
    }

    public final boolean canBeObserverForColumn(Column column) {
        return column.contains(taskStatus);
    }

    protected abstract Task getTaskWhenDone(Task task);
    protected abstract String getDetails(Task task);
}
