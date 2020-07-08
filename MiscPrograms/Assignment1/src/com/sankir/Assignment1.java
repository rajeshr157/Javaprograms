package com.sankir;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;

        while (n != num + 1) {
            for (int i = 1; i <= n; i++) {
                System.out.print(n + " ");
            }
            System.out.println();
            n++;
        }

        System.out.println("Enter the number to sum up");
        int number = sc.nextInt();


        int quotient = number;
        int sum = 0;

        while (quotient != 0) {
            sum = sum + quotient % 10;
            quotient = quotient / 10;

        }
        System.out.println(sum);

    }
}
