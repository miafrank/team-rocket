package com.example.teamrocket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BodyPart {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany
    private List<HealthTrait> healthTraitList = new ArrayList<>();

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

    public List<HealthTrait> getHealthTraitList() {
        return healthTraitList;
    }

    public void setHealthTraitList(List<HealthTrait> healthTraitList) {
        this.healthTraitList = healthTraitList;
    }

    //    Default constructor
    public BodyPart() {};
}
