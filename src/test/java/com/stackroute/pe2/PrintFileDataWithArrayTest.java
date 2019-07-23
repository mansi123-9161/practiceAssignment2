package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class PrintFileDataWithArrayTest {
    PrintFileDataWithArray printFileDataWithArray;
    @Before
    public void setUp() throws Exception {
        //arrange
        System.out.println("inside before");
        this.printFileDataWithArray = new PrintFileDataWithArray();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("inside after");
        this.printFileDataWithArray=null;
    }
    @Test
    public void givenFileDataShouldBePrintedInByteArray() throws Exception {
        //Arrange
        int expectedValue=1;
        int actualValue=0;

        String str="this is test file";
        byte[] bytearr1= str.getBytes();
        byte[] bytearr2;

        //Act
        bytearr2=printFileDataWithArray.byteFileContent("file.text");
        //Assert
        if (Arrays.equals(bytearr1, bytearr2))
        {
            actualValue=1;
        }
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }


}