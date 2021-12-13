package com.yeahbutstill.demojavaoop.membuatexception.utils;

import com.yeahbutstill.demojavaoop.membuatexception.runtimeexception.BlankException;
import com.yeahbutstill.demojavaoop.redcordclasss.LoginRequest;

public class ValidateRuntime {
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new BlankException("Username tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username tidak boleh kosong");
        } else if (loginRequest.password() == null) {
            throw new BlankException("Password tidak boleh null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password tidak boleh kosong");
        }
    }
}
