package com.yeahbutstill.demojavaoop.staticfield;

public class Application {
    public static final int PROCESSOR;

    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
