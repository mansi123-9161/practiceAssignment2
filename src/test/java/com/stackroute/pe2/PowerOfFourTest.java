package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour powerOfFour;
    @Before
    public void setUp() {
        System.out.println("Inside setup");
        powerOfFour = new PowerOfFour();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        powerOfFour = null;
    }
    @Test
    public void givenNumberIsPowerOfFour() {
        //Arrange
        int expectedValue = 16;

        //Act
        int actualValue = powerOfFour.isPowerOfFour(2);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}