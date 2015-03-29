package com.sampleapp.spring2014;

import org.springframework.stereotype.Component;

/**
 * Created by bha on 3/28/15.
 */

@Component
public class CounterService {
    public int count(int currentValue) {
        return ++currentValue;
    }
}
