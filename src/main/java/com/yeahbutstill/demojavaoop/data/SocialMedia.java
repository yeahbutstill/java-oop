package com.yeahbutstill.demojavaoop.data;

class SocialMedia {
    public String username;
    public String email;
}

final class Instagram extends SocialMedia {

    final void login(String username, String password) {

    }
}

final class Facebook extends SocialMedia {

    final void login(String email, String password) {

    }
}

class Google extends SocialMedia {
    void login(String username, String password) {

    }
}

//class FakeFacebook extends Facebook { // error
//
//    void login(String username, String password) { // error
//
//    }
//}
