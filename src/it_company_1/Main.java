package it_company_1;

import it_company_1.employee.chain.EmployeeChain;
import it_company_1.employee.employees.Designer;
import it_company_1.employee.employees.Programmer;
import it_company_1.employee.employees.Tester;
import it_company_1.task.TaskFactory;
import it_company_1.task.task_callback.CallbackImpl;
import it_company_1.task.task_callback.TaskProgressCallback;

public class Main {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new CallbackImpl(factory);
        EmployeeChain chain = new EmployeeChain(new Designer(callback, "Al"));
        EmployeeChain next = new EmployeeChain(new Programmer(callback, "Fe"));
        EmployeeChain last = new EmployeeChain(new Tester(callback, "Re"));
        next.setNextEmployee(last);
        chain.setNextEmployee(next);

        while (true) {
            chain.doTask(factory.getTask());
        }
    }
}
