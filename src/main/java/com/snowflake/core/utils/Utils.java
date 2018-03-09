package com.snowflake.core.utils;

/**
 * Created by localadmin on 2017/10/25.
 */
public class Utils {

    public static long currentTimeMs() {
        return System.currentTimeMillis();
    }

    public static void sleepMs(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
