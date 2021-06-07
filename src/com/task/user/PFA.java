package com.task.user;

public class PFA extends User {

    private UserType userType;

    public PFA(String name) {
        super(name);
        this.userType = UserType.PFA;
    }
}
