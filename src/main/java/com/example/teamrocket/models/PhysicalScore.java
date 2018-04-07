package com.example.teamrocket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class PhysicalScore {

    @Id
    @GeneratedValue
    private int id;

    private int score;

//    Getters and setters
    public int getId() {
        return id;
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
