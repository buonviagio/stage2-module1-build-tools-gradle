package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    void isPositiveNumberTest() {
        String s1 = "65", s2 = "-12", s3 = "F";
        assertTrue(StringUtils.isPositiveNumber(s1));
    }

}