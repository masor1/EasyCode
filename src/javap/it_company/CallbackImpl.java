package javap.it_company;

public class CallbackImpl implements TaskProgressCallback{

    public final TaskFactory taskFactory;

    public CallbackImpl(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }

    @Override
    public void updateTask(Task oldTask, Task newTask) {
        taskFactory.updateTask(oldTask, newTask);
    }
}
