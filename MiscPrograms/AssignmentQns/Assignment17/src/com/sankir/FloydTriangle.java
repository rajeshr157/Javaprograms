package com.sankir;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows required in the Floyd's triangle");
        int rows = sc.nextInt();

        int num = 1;

        System.out.println();

        for (int i = 1; i <= rows; i++) {

            int j = 1;

            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }
            System.out.println();

        }

    }
}
