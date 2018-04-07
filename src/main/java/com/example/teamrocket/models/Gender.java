package com.example.teamrocket.models;

public enum Gender {

    F("Female"),
    M("Male");

    private final String name;

    Gender(String name) {this.name = name;}

    public String getName() {return name;}

}
