package com.example.teamrocket.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class HealthTrait {

    @GeneratedValue
    @Id
    private int id;

    private String name;

    @ManyToOne
    private BodyPart bodyPart;

    @OneToMany
    private List<EmotionalScore> emotionalScores = new ArrayList<>();

    @OneToMany
    private List<PhysicalScore> physicalScores = new ArrayList<>();

    //TODO figure out relationship
    private List<Question> questions = new ArrayList<>();

//    Getters and setters
    //TODO add getters and setters

//    Default constructor
    public HealthTrait() {}
}
