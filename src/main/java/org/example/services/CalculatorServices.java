package org.example.services;

public class CalculatorServices {
    public static int addTwoNumber(int a,int b){
        return a+b;
    }

    public static int productTwoNumber(int a,int b){
        return a*b;
    }

    public static int dividedTwoNumber(int a,int b){
        return a/b;
    }

    public static int sumAnyNumber(int ...numbers){
        int s=0;
        for(int n:numbers){
            s+=n;
        }
        return s;
    }
}
