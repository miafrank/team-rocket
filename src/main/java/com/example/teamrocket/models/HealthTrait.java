package com.example.teamrocket.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class HealthTrait {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne
    private BodyPart bodyPart;

    @OneToMany
    private List<EmotionalScore> emotionalScores = new ArrayList<>();

    @OneToMany
    private List<PhysicalScore> physicalScores = new ArrayList<>();

    @OneToMany
    private List<TrackingQuestion> trackingQuestions = new ArrayList<>();

//    Getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BodyPart getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(BodyPart bodyPart) {
        this.bodyPart = bodyPart;
    }

    public List<EmotionalScore> getEmotionalScores() {
        return emotionalScores;
    }

    public void setEmotionalScores(List<EmotionalScore> emotionalScores) {
        this.emotionalScores = emotionalScores;
    }

    public List<PhysicalScore> getPhysicalScores() {
        return physicalScores;
    }

    public void setPhysicalScores(List<PhysicalScore> physicalScores) {
        this.physicalScores = physicalScores;
    }

    public List<TrackingQuestion> getTrackingQuestions() {
        return trackingQuestions;
    }

    public void setTrackingQuestions(List<TrackingQuestion> trackingQuestions) {
        this.trackingQuestions = trackingQuestions;
    }

    //    Default constructor
    public HealthTrait() {}


}
