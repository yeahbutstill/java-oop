package com.yeahbutstill.demojavaoop.membuatexception.utils;

import com.yeahbutstill.demojavaoop.membuatexception.ValidationException;
import com.yeahbutstill.demojavaoop.redcordclasss.LoginRequest;

public class ValidationUtil {
    public static void validaate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username tidak boleng kosong");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password tidak boleh kosong");
        }
    }
}
