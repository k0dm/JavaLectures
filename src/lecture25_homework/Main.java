package lecture25_homework;

public class Main {
    public static void main(String[] args) {
        Task task = new ProgramTask(Complexity.MIDDLE, "Write a backend part",Status.READY_TO_DO);
        Employee programmer = new Programmer("John", 29, ClassificationOfDeveloper.MIDDLE);
        Designer designer = new Designer("Kate", 23, ClassificationOfDeveloper.SENIOR);
        Employee tester = new Tester("Peter", 20, ClassificationOfDeveloper.MIDDLE);
        print(task);
        task = programmer.solveTask(task);
        print(task);
        task = tester.solveTask(task);
        print(task);
        task = tester.solveTask(task);


        Task newTaskForSeniorProgrammer = designer.createTask(Complexity.HARD, "code UI", Status.READY_TO_DO);
        task = programmer.solveTask(newTaskForSeniorProgrammer);
    }

    public static void print (Object object){
        System.out.println(object);
    }
}
