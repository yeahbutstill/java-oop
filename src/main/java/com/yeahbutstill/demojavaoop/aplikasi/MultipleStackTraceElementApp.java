package com.yeahbutstill.demojavaoop.aplikasi;

public class MultipleStackTraceElementApp {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] buah = {
                    "Jeruk", "Mangga", "Alpukat"
            };
            System.out.println(buah[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
