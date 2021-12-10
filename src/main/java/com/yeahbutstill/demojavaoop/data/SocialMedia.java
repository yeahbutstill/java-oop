package com.yeahbutstill.demojavaoop.data;

class SocialMedia {
    public String username;
    public String email;
}

final class Instagram extends SocialMedia {

}

final class Facebook extends SocialMedia {

}

class Google extends SocialMedia {
    
}

class FakeFacebook extends Facebook { // error

}
