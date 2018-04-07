package com.example.teamrocket.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BodyPart {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany
    @JoinColumn(name="health_id")
    private List<HealthTrait> healthTraits = new ArrayList<>();

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

    public List<HealthTrait> getHealthTraits() {
        return healthTraits;
    }

    public void setHealthTraits(List<HealthTrait> healthTraits) {
        this.healthTraits = healthTraits;
    }

    //    Default constructor
    public BodyPart() {}

    public BodyPart(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
