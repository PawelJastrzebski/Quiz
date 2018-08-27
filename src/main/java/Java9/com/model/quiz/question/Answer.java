package Java9.com.model.quiz.question;

public class Answer {

    private String answerText;
    private boolean isItCorrect;


    public Answer(String answerText, boolean isItCorrect) {
        this.answerText = answerText;
        this.isItCorrect = isItCorrect;
    }

    public String getTrescPytania() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean isItCorrect() {
        return isItCorrect;
    }

    public void setItCorrect(boolean itCorrect) {
        isItCorrect = itCorrect;
    }
}
