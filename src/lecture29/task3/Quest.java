package lecture29.task3;

import java.util.Scanner;

public class Quest implements Level {


    @Override
    public void nextLevel(Question question) throws Exception {


        question.showQuestion();
        int userAnswer = answer();


        if (userAnswer > question.numOfAnswers() || userAnswer < 1 || userAnswer == question.getWrongAnswer()) {
            throw new Exception("You are dead!!!");
        }
        nextLevel(question.getAnswers().get(userAnswer-1).getNextQuestion());

    }


    public Integer answer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> ");
        return scanner.nextInt();
    }
}
