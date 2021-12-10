package com.yeahbutstill.demojavaoop.redcordclasss;

public record LoginRequest(String username, String password) {

    //Record constructor
    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

}
