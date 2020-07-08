package com.sankir;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number to create the number triangle");
        int num = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= num; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
        }

        System.out.println();

        for (int i = num; i >= 1; i--) {
            int j = 1;
            while (j <= i) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
        }
    }
}
