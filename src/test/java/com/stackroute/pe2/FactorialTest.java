package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    FactorialTest factorialTest;
    @Before
    public void setUp() throws Exception {
     //arrange
        System.out.println("inside before");
        this.getFileNameAndData = new FactorialTest();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("inside after");
        this.factorialTest=null;
    }
    //test case to check if given input is positive
    @Test
    public void givenInputValueShouldBePositive(){
        String actualresult=factorialTest.printIntFactorial(-1);
        assertEquals("value should be positive",actualresult);
    }
    @Test
    public void givenInputValueShouldBePositive(){
        String actualresult=factorialTest.printLongFactorial(-1);
        assertEquals("value should be positive",actualresult);
    }
    //test case to check if give input
    @Test
    public void givenInputValueShouldBeOutOfRange(){
        String actualresult=factorialTest.printIntFactorial(15);
        assertEquals("value should be within the range",actualresult);
    }
    @Test
    public void givenInputValueShouldBeOutOfRange(){
        String actualresult=factorialTest.printLongFactorial(25);
        assertEquals("value should be out of range",actualresult);
    }
}