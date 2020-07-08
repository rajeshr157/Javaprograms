package com.sankir;

import java.util.Scanner;

public class Primenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("The list of prime numbers between 1 and 1000 are: 2,");


        for (int i = 3; i <= 1000; i++) {
            int flag = 1;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    flag = 0;
                    break;
                } else
                    continue;
            }

            if (flag == 1)
                System.out.print(i + ",");
        }
    }
}
