package com.example.teamrocket.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BodyPart {

    @GeneratedValue
    @Id
    private int id;

    private String name;

    @OneToMany
    @JoinColumn(name="HealthTrait_id")
    private List<HealthTrait> healthTraits = new ArrayList<>();

//    Getters and setters
    //TODO add getters and setters

//    Default constructor
    public BodyPart() {}

}
