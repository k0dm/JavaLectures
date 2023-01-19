package lecture29.task3;

import java.util.List;

public class Question {
    private final String description;
    private final List<Answer> answers;
    private final int wrongAnswer;

    public Question(String description, List<Answer> answers, int wrongAnswer) {
        this.description = description;
        this.answers = answers;
        this.wrongAnswer = wrongAnswer;
    }

    public Integer getWrongAnswer() {
        return  wrongAnswer;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public int numOfAnswers() {
        return answers.size();
    }
    public void showQuestion() {
        System.out.println(description);
        for (int i = 0; i < answers.size(); i++) {
            System.out.println(i+1 + ". " + answers.get(i).getDescription());
        }
    }


}
