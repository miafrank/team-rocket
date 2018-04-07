package com.example.teamrocket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private Gender gender;

    //Zip code
    private int location;

    @ManyToMany
    private List<HealthTrait> healthTraits = new ArrayList<>();

//    Getters and setters

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<HealthTrait> getHealthTraits() {
        return healthTraits;
    }

    public void setHealthTraits(List<HealthTrait> healthTraits) {
        this.healthTraits = healthTraits;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    //    Default constructor
    public Person() {}
}
