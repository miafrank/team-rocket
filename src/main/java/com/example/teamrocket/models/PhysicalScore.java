package com.example.teamrocket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class PhysicalScore {

    @GeneratedValue
    @Id
    private int id;

    private LocalDate physicalScoreDate;

    private LocalTime physicalScoreTime;

    private int score;

//    Getters and setters


    public int getId() {
        return id;
    }

    public LocalDate getPhysicalScoreDate() {
        return physicalScoreDate;
    }

    public void setPhysicalScoreDate(LocalDate physicalScoreDate) {
        this.physicalScoreDate = physicalScoreDate;
    }

    public LocalTime getPhysicalScoreTime() {
        return physicalScoreTime;
    }

    public void setPhysicalScoreTime(LocalTime physicalScoreTime) {
        this.physicalScoreTime = physicalScoreTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //    Default Constructor
    public PhysicalScore() {}
}
