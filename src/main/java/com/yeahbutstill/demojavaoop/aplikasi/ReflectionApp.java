package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.annotationdifield.CreateUserRequest;
import com.yeahbutstill.demojavaoop.membuatexception.utils.ValidationReflection;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUsername("dani");
        createUserRequest.setPassword("dani");
        ValidationReflection.validationReflection(createUserRequest);
    }
}
