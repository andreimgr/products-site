package com.task.user;

public abstract class User {

    public enum UserType {
        PFA,
        SRL,
        PERSOANA_FIZICA
    }

    private int id;
    private static int generateId;
    private String name;

    public User(String name) {
        this.id = generateId();
        this.name = name;
    }

    public int generateId() {
        return generateId++;
    }
}
