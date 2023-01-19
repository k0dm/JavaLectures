package lecture29.task3;

public class Answer {
    private final String description;
    private final int answerNumber;
    private  Question nextQuestion ;

    public Answer(String description, int answerNumber, Question nextQuestion) {
        this.description = description;
        this.answerNumber = answerNumber;
        this.nextQuestion = nextQuestion;
    }
    public Answer(String description, int answerNumber) {
        this.description = description;
        this.answerNumber = answerNumber;
        this.nextQuestion = null;
    }

    public String getDescription() {
        return description;
    }

    public Question getNextQuestion() {
        return nextQuestion;
    }

    public void setNextQuestion(Question nextQuestion) {
        this.nextQuestion = nextQuestion;
    }
}
