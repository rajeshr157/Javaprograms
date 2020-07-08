package com.sankir;

import java.util.Scanner;

public class factorialRecursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int factorial = Factorial(num);

        System.out.println();
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static int Factorial(int n) {
        if (n > 1) {
            n = n * Factorial(n - 1);
            return n;
        } else
            return 1;
    }
}
