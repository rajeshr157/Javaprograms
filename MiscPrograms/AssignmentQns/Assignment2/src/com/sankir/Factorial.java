package com.sankir;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to be found");
        int num = sc.nextInt();

        int factorial=1;

        for (int i=1; i<=num; i++) {
            factorial= factorial *i;
        }
        System.out.println("The factorial of the given number "+num+" is: "+factorial);
    }
}
