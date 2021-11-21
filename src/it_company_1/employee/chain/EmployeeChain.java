package it_company_1.employee.chain;

import it_company_1.employee.Employee;
import it_company_1.task.Task;

public class EmployeeChain {

    private final Employee employee;
    private EmployeeChain nextEmployeeChain;

    public EmployeeChain(Employee employee) {
        this.employee = employee;
    }

    public void doTask(Task task) {
        if (task.getStatus() == employee.getTaskStatus()) {
            employee.doTask(task);
        } else if (nextEmployeeChain != null) {
            nextEmployeeChain.doTask(task);
        } else {
            throw new IllegalArgumentException("task cant be handled");
        }
    }

    public void setNextEmployee(EmployeeChain nextEmployeeChain) {
        this.nextEmployeeChain = nextEmployeeChain;
    }
}
