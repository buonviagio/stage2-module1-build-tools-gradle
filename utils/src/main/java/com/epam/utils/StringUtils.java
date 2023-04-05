package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        if(str == null){
            return false;
        }
        if (NumberUtils.isCreatable(str)) {
            if (str.endsWith("d") || str.endsWith("D")) {
                return NumberUtils.createDouble(str) > 0;
            } else if (str.endsWith("l") || str.endsWith("L")) {
                return NumberUtils.createLong(str) > 0;
            } else if (str.endsWith("f") || str.endsWith("F")) {
                return NumberUtils.createFloat(str) > 0;
            }
        }
        if (NumberUtils.isDigits(str)) {
            if(str.startsWith("0")){
                return false;
            }
            return NumberUtils.createBigInteger(str).compareTo(new BigInteger("0")) > 0;
        }
        if (str.contains(".")) {
            return NumberUtils.createBigDecimal(str).compareTo(new BigDecimal("0.0")) > 0;
        }
        return false;
    }
}
