package it_company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        List<Employee> employees = new ArrayList<>();
        TaskProgressCallback callback = new CallbackImpl(factory);
        employees.add(new Designer(callback, "Artem"));
        employees.add(new Programmer((oldTask, newTask) -> {
            System.out.println("Programmer updateTask");
            }, "Fedor"));
        employees.add(new Tester(callback, "Ksenia"));
        factory.addEmployees(employees);
        factory.start();
    }
}
