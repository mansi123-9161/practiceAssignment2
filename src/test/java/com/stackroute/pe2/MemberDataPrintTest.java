package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberDataPrintTest {
   MemberDataPrint memberDataPrint;
    @Before
    public void setUp() throws Exception {
        //arrange
        System.out.println("inside before");
        this.memberDataPrint = new MemberDataPrint();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("inside after");
        this.memberDataPrint=null;
    }
    @Test

    public void givenStringArrayShouldPrintCorrectValue() throws Exception {
        //Arrange
        String[] Es= new String[3];
        Es[0]="Harry Potter";
        Es[1]="30";
        Es[2]="2500.3";
        int  expectedValue=1;
        int actualValue=0;

        //Act
        String[] As = MemberDataPrint.memberData("Harry Potter", 30, 2500.3);
        //Assert
        if (Es[0].equals(As[0])&&Es[1].equals(As[1])&&Es[2].equals(As[2]))
        {
            actualValue=1;
        }
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }

}