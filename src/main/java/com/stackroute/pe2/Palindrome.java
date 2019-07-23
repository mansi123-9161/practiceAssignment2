package com.stackroute.pe2;

public class Palindrome {
    String palindromeCheck(String str)  //test 1 que
    {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            str1 = str1 + str.charAt(i);
        }
        return str1;
    }

}
