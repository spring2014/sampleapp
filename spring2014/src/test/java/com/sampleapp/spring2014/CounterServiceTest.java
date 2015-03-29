package com.sampleapp.spring2014;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterServiceTest {
    @Test
    public void testCount() throws Exception {
        final int initialValue = 0;
        final int expectedValue = 1;

        CounterService counterService = new CounterService();
        final int result = counterService.count(initialValue);

        assertEquals(expectedValue, result);
    }
}