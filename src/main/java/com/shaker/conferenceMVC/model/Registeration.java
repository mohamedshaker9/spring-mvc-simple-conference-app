package com.shaker.conferenceMVC.model;

import javax.validation.constraints.NotEmpty;

public class Registeration {

    @NotEmpty
    private String name;

    public Registeration(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
