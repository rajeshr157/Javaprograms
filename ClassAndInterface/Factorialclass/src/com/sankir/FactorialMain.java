package com.sankir;

public class FactorialMain {
    public static void main(String[] args) {
        Factorial fact1 = new Factorial();

        int fact=0;

        fact =  fact1.getFactorial(5);
        System.out.println("Factorial of 5 is : "+ fact);

        fact =fact1.getFactorial(7);
        System.out.println("Factorial of 7 is : "+fact);
    }
}
