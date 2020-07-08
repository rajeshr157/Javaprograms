package com.sankir;

public class ThreeDigitSum {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 100; i <= 999; i++) {
            if ((i % 10) == ((i / 10) % 10) + ((i / 100) % 10)) {
                System.out.print(i + ",");
                count++;

            }
        }
        System.out.println();
        System.out.println("The total number of elements is : "+count);
    }
}