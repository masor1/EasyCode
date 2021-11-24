package javap.it_company_1.observer;

import javap.it_company_1.task.Task;

public interface Observer {
    void handleTask(Task task);
}
