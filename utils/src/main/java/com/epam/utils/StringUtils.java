package com.epam.utils;

public class StringUtils {

    public StringUtils() {}

    public static boolean isPositiveNumber(String str) {
        return Integer.parseInt(str) > 0;
    }
}
