package com.yeahbutstill.demojavaoop.staticfield;

public class MathUtil {

    public static int sum(int... values) {
        int total = 0;
        for (var val : values) {
            total += val;
        }
        return total;
    }

}
