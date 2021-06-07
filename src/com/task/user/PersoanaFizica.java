package com.task.user;

public class PersoanaFizica extends User {

    private UserType userType;

    public PersoanaFizica(String name) {
        super(name);
        this.userType = UserType.PERSOANA_FIZICA;
    }
}
