package it_company_1.employee.employees;

import it_company_1.employee.Employee;
import it_company_1.task.Task;
import it_company_1.task.task_callback.TaskProgressCallback;

public class Tester extends Employee {

    public Tester(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.READY_FOR_TESTING);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.DONE,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestcase(),
                task.getBuildLink()
        );
    }

    @Override
    protected String getDetails(Task task) {
        return " with id " + task.getId() + " and testcase " + task.getTestcase();
    }
}
