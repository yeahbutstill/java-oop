package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.redcordclasss.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("danilaway", "sangatrahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest()); // tanpa parameter
        System.out.println(new LoginRequest("dani"));
        System.out.println(new LoginRequest("dani", "rahasia"));

    }
}
