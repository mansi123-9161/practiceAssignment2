package com.stackroute.pe2;

public class StudentData{
    int[] isGrades(int inputArray[], int n)
    {
        int avg;
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        int sum=0;
        for(int i = 0; i < n ; i++)
        {
            sum = sum + inputArray[i];
        }
        avg =sum / n;
        inputArray[0]=avg;
        inputArray[1]=minValue;
        inputArray[2]=maxValue;
        return inputArray;
    }

}