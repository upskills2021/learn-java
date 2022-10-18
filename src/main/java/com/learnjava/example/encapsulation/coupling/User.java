package com.learnjava.example.encapsulation.coupling;

public class User {
    private String userId;
    private UserDetails userDetails;



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
