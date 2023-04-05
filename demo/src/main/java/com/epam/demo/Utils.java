package com.epam.demo;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.List;

public class Utils {
    public static void main(String[] args) {

        System.out.println(isAllPositiveNumbers(Arrays.asList("1", "2", "3")));
    }
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            if (NumberUtils.toInt(str) <= 0) {
                return false;
            }
        }
        return true;
    }
}