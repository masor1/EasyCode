package javap.it_company;

public interface TaskProgressCallback {
    void updateTask(Task oldTask, Task newTask);
}
