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
    public void givenFolderNameShouldStartWithValidValue()
    {
        String[] actualresult =getFileNameAndData.getFileData("Documents");
        assertEquals("file name is correct",actualresult);
    }
    @Test
    public void givenFileNameShouldNotStartWithValidValue()
    {
        String[] actualresult =getFileNameAndData.getFileData("@java");
        assertEquals("file name is not correct",actualresult);
    }
    @Test
    public void givenFileNameShouldHaveAProperExtenssion()
    {
        String[] actualresult =getFileNameAndData.getFileData(".exe");
        assertEquals("file name extension is correct",actualresult);
    }

}