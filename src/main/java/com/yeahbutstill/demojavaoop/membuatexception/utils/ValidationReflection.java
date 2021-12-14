package com.yeahbutstill.demojavaoop.membuatexception.utils;

import com.yeahbutstill.demojavaoop.codeannotation.NotBlank;
import com.yeahbutstill.demojavaoop.membuatexception.runtimeexception.BlankException;

import java.lang.reflect.Field;

public class ValidationReflection {
    public static void validationReflection(Object o) { // di sini pakai Object, artinya kelas apapun bisa divalidasi

        Class aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null) {
                // validate
                try {
                    String value = (String) field.get(o);
                    if (value == null || value.isBlank()) {
                        throw new BlankException(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
