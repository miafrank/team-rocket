package com.example.teamrocket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class EmotionalScore {

    @Id
    @GeneratedValue
    private int id;

    private LocalDate emotionalScoreDate;

    private LocalTime emotionalScoreTime;

    private int score;

//    Getters and setters


    public int getId() {
        return id;
    }

    public LocalDate getEmotionalScoreDate() {
        return emotionalScoreDate;
    }

    public void setEmotionalScoreDate(LocalDate emotionalScoreDate) {
        this.emotionalScoreDate = emotionalScoreDate;
    }

    public LocalTime getEmotionalScoreTime() {
        return emotionalScoreTime;
    }

    public void setEmotionalScoreTime(LocalTime emotionalScoreTime) {
        this.emotionalScoreTime = emotionalScoreTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //    Default Constructor
    public EmotionalScore() {}
}
