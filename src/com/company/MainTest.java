package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by apava on 06.01.2016.
 */
public class MainTest {

    @Test
    public void testTestingMethod() throws Exception {
        assertEquals(5,new Main().testingMethod(0));
        assertEquals(10,new Main().testingMethod(5));
        assertEquals(6,new Main().testingMethod(1));

    }
}