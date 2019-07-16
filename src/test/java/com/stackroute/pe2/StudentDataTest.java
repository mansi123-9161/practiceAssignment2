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
    public void checkIftheGivenNumberOfStudentShouldBeValid(){
        String actualresult =studentData.getSudentData(0);
        assertEquals("enter correct positive value",actualresult);

    }
    @Test
    public void checkIfTheGivenArrayShouldNotBeEqualToNumberOfStudent(){
        String actualresult = studentData.getStudentData(-1);
        assertEquals("enter positive value",actualresult);
    }
    @Test
    public void checkIfMarksSHouldNotBeOutOfLimit(){
        String actualresult = studentData.getStudentData(101);
        assertEquals("enter value within the limit",actualresult);
    }
    @Test
    public void checkIfMarksSHouldNotBeBelowOfLimit(){
        String actualresult= studentData.getStudentData(-1);
        assertNotEquals("enter value above the limit",actualresult);
    }
    @Test
    public void checkIfMarksShouldBeAboveMinimumLimit(){
        String actualresult= studentData.getMin();
        assertEquals("",actualresult);
    }

}