package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.codeannotation.Fancy;
import com.yeahbutstill.demojavaoop.membuatexception.ValidationException;
import com.yeahbutstill.demojavaoop.membuatexception.utils.ValidateRuntime;
import com.yeahbutstill.demojavaoop.membuatexception.utils.ValidationUtil;
import com.yeahbutstill.demojavaoop.redcordclasss.LoginRequest;

public class ValidationApp {
    @Fancy(name = "Validation", tags = {"app", "java"})
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, "");
        try {
            ValidationUtil.validaate(loginRequest);
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Terjadi Error Dengan Pesan " + e.getMessage());
        } finally {
            System.out.println("Error Gak Error, tetap di panggil");
        }

        // Runtime Exception
        LoginRequest loginRequest1 = new LoginRequest(null, null);
        ValidateRuntime.validateRuntime(loginRequest1);
    }
}
