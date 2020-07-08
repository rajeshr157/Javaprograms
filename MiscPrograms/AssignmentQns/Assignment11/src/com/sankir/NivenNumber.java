package com.sankir;

public class NivenNumber {
    public static void main(String[] args) {
        System.out.println("The Niven numbers between 1 and 1000 are as follows: ");
        for (int i = 10; i <= 1000; i++) {
            int quotient = i;
            int remainder = 0;
            int sum = 0;

            while (quotient != 0) {

                remainder = quotient % 10;
                quotient /= 10;
                sum = sum + remainder;
            }
            if (i % sum == 0)
                System.out.print(i + ",");
        }
    }
}