package javap.it_company_1.employee.chain;

import javap.it_company_1.task.TaskHandler;
import javap.it_company_1.task.Task;

public class EmployeeChain implements TaskHandler {

    private final TaskHandler first;
    private final TaskHandler second;

    public EmployeeChain(TaskHandler first,
                         TaskHandler second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean doTask(Task task) {
        boolean result;
        result = first.doTask(task);
        if (!result) {
            result = second.doTask(task);
        }
        return result;
    }
}