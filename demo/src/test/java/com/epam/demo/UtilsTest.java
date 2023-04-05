package com.epam.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        List<String> list1 = Arrays.asList("21", "32", "65", "74");
        List<String> list2 = Arrays.asList("21", "-32", "65", "74");
        assertTrue(Utils.isAllPositiveNumbers(list1));
        assertFalse(Utils.isAllPositiveNumbers(list2));
    }
}