package com.stackroute.pe2;

public class MemberDataPrint {
    static String[] memberData(String name, int age, double Salary) {
        String ag=String.valueOf(age);
        String sal= String.valueOf(Salary);
        String []s= new String[3];
        s[0]=name;
        s[1]=ag;
        s[2]=sal;
        return s;
    }
}
