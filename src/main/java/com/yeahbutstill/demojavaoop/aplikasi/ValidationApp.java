package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.membuatexception.ValidationException;
import com.yeahbutstill.demojavaoop.membuatexception.utils.ValidationUtil;
import com.yeahbutstill.demojavaoop.redcordclasss.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, null);
        try {
            ValidationUtil.validaate(loginRequest);
        } catch (ValidationException e) {
            System.out.println("Terjadi Error Dengan Pesan " + e.getMessage());
        }
    }
}
