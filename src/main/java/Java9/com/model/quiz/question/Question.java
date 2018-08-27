package Java9.com.model.quiz.question;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private Integer id;
    private String questionText;
    private List<Answer> addingAnswersToQuestions = new ArrayList<>();


    public Question(Integer id, String questionText) {
        this.id = id;
        this.questionText = questionText;
    }

    public void addAnswersToQestions(Answer answer){
        this.addingAnswersToQuestions.add(answer);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
}
