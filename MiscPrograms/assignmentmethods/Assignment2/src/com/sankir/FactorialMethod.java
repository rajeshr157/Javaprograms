package com.sankir;

import java.util.Scanner;

public class FactorialMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to be found");
        int num = sc.nextInt();

        System.out.println("The factorial of the given number " + num + " is: " + factorial(num));
    }


    public static int factorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }
}