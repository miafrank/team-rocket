package com.example.teamrocket.models;

public enum QuestionType {
    E("Emotional"),
    P("Physical");

    private final String name;

    QuestionType(String name) {this.name = name;}

    public String getName() {return name;}
}
