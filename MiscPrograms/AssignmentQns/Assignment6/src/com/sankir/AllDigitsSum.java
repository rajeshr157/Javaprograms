package com.sankir;

import java.util.Scanner;

public class AllDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose sum of digits is to be calculated");
        int num = sc.nextInt();

        int quotient = num / 10, sum = num % 10;

        while (quotient != 0) {

            sum = sum + quotient % 10;
            quotient = quotient / 10;
        }

        System.out.println();

        System.out.println("The sum of digits of the number-"+num+", is: "+sum);
    }
}
