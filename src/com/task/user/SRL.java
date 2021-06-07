package com.task.user;

public class SRL extends User {

    private UserType userType;

    public SRL(String name) {
        super(name);
        userType = UserType.SRL;
    }

}
