package lecture28;

import lecture26.Task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskFactory factory  = new TaskFactory();
        List<Employee> employees = new ArrayList<>();
        TaskProgressCallback callback =  new CallbackImpl(factory);
        employees.add( new Designer(callback, "Kate"));
        employees.add( new Programmer(new TaskProgressCallback() {
            @Override
            public void updateTask(Task oldTask, Task newTask) {
                System.out.println("Programmer updateTask");
            }
        }, "John"));
        employees.add( new Tester(callback, "Steve"));
        factory.addEmployees(employees);
        factory.start();
    }
}
