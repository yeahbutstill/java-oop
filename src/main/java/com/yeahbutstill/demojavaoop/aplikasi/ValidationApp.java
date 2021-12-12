package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.membuatexception.ValidationException;
import com.yeahbutstill.demojavaoop.membuatexception.utils.ValidationUtil;
import com.yeahbutstill.demojavaoop.redcordclasss.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, "");
        try {
            ValidationUtil.validaate(loginRequest);
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Terjadi Error Dengan Pesan " + e.getMessage());
        } finally {
            System.out.println("Error Gak Error, tetap di panggil");
        }
    }
}
