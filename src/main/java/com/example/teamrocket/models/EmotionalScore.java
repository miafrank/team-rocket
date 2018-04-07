package com.example.teamrocket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmotionalScore {

    @GeneratedValue
    @Id
    private int id;

    //TODO figure out time stamp

    //TODO figure out date stamp

    private int score;

//    Getters and setters
    //TODO add getters and setters

//    Default Constructor
    public EmotionalScore() {}
}
