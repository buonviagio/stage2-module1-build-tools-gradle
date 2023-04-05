package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean result = false;
        for (String str : args) {
            result = StringUtils.isPositiveNumber(str);
            if(!result){
                return false;
            }
        }
        return result;
    }
}