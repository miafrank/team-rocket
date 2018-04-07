package com.example.teamrocket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {

    @GeneratedValue
    @Id
    private int id;

    private String questionStatement;

    private int answer;

    //TODO figure out how to add emotional or physical type

//    Getters and setters
    //TODO add getters and setters

//    Default constructor
    public Question() {}
}
