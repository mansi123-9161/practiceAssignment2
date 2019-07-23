package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentDataTest {
    StudentData studentData;
    @Before
    public void setUp() throws Exception {
        //arrange
        System.out.println("inside before");
        this.studentData = new StudentData();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("inside after");
        this.studentData=null;
    }
    @Test
    public void givenStudentsGradeShouldBeInValidRange() throws Exception {
        //Arrange
        boolean expected=true,actual=false;
        int[] expectedValue=new int[3];
        expectedValue[0]=81;
        expectedValue[1]=65;
        expectedValue[2]=98;
        int a[]=new int[4];//declaration and instantiation
        a[0]=86;//initialization
        a[1]=65;
        a[2]=98;
        a[3]=77;

        //Act
        int[] actualValue=studentData.isGrades(a,4);
        if (expectedValue[0]==actualValue[0]&&expectedValue[1]==actualValue[1]&&expectedValue[2]==actualValue[2])
        {
            actual=true;
        }
        //Assert
        assertEquals(expected, actual);
        assertNotNull(actualValue);

    }
}