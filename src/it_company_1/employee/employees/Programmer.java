package it_company_1.employee.employees;

import it_company_1.task.Task;
import it_company_1.task.task_callback.TaskProgressCallback;
import it_company_1.employee.Employee;

public class Programmer extends Employee {

    protected Programmer(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.READY_TO_DO);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.READY_FOR_TESTING,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestcase(),
                getBuildLinkForTask(task.getId())
        );
    }

    @Override
    protected String getDetails(Task task) {
        return " with task id " + task.getId() +
                " and design link " + task.getDesignLink() +
                "\nand testcase " + task.getTestcase();
    }

    private String getBuildLinkForTask(int taskId) {
        return "https://link_for_testcase_task_" + taskId;
    }
}
