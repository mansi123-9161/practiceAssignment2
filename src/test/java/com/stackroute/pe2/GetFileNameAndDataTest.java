package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GetFileNameAndDataTest {
    GetFileNameAndData getFileNameAndData;
    @Before
    public void setUp() throws Exception {
        //arrange
        System.out.println("inside before");
        this.getFileNameAndData = new GetFileNameAndData();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("inside after");
        this.getFileNameAndData=null;
    }
    @Test
    public void test4() throws Exception {
        //Arrange
        String expectedValue="THIS IS TEST FILE";

        //Act
        String actualValue=getFileNameAndData.contentPrintTextFile("file.txt");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }

}