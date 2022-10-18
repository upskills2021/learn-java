package com.learnjava.example.encapsulation.coupling;

public class UserDetails {
    private String details;

    public UserDetails(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
