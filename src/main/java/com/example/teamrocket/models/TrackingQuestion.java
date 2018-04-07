package com.example.teamrocket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TrackingQuestion {

    @GeneratedValue
    @Id
    private int id;

    private String questionStatement;

    private int answer;

    private QuestionType questionType;

//    Getters and setters

    public int getId() {
        return id;
    }

    public String getQuestionStatement() {
        return questionStatement;
    }

    public void setQuestionStatement(String questionStatement) {
        this.questionStatement = questionStatement;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    //    Default constructor
    public TrackingQuestion() {}
}
