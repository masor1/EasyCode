package it_company_1.observer;

import it_company_1.task.Task;

public interface Observer {
    void handleTask(Task task);
}
