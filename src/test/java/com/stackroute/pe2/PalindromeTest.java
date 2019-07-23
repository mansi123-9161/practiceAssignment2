package com.stackroute.pe2;
import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp() {
        System.out.println("Inside setup");
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        palindrome = null;
    }

    @Test
    public void givenStringShouldReturnPalindrome()  {
        //Arrange
        String expectedValue = "ihba";

        //Act
        String actualValue = palindrome.palindromeCheck("abhi");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }


}