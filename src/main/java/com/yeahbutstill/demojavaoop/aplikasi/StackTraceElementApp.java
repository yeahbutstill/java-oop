package com.yeahbutstill.demojavaoop.aplikasi;

public class StackTraceElementApp {
    public static void main(String[] args) {
        try {
            String[] names = {
                    "Dani", "Maya", "Winda"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            throwable.printStackTrace();
        }
    }
}
