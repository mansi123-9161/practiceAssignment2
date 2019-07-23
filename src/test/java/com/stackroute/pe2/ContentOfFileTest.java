package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContentOfFileTest {
    ContentOfFile contentOfFile;
    @Before
    public void setUp() {
        System.out.println("Inside setup");
        contentOfFile = new ContentOfFile();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        contentOfFile= null;
    }
    @Test
    public void test9() throws Exception {
        //Arrange
        int expectedValue=12;

        //Act
        int actualValue =ContentOfFile.contentOfFileTimes("FileDemo.txt");
        //Assert

        assertEquals(expectedValue, actualValue);

    }

}