package it_company_1;

import it_company_1.employee.Employee;
import it_company_1.employee.employees.Designer;
import it_company_1.employee.employees.Programmer;
import it_company_1.employee.employees.Tester;
import it_company_1.task.TaskFactory;
import it_company_1.task.task_callback.CallbackImpl;
import it_company_1.task.task_callback.TaskProgressCallback;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        List<Employee> employees = new ArrayList<>();
        TaskProgressCallback callback = new CallbackImpl(factory);
        employees.add(new Designer(callback,"Designer"));
        employees.add(new Programmer(callback, "Programmer"));
        employees.add(new Tester(callback, "Tester"));
        factory.addEmployees(employees);
        factory.start();
    }
}
