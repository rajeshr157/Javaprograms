package com.sankir;

public class Palindrome {
    public static void main(String[] args) {

        System.out.print("The palindrome numbers are: ");
        int count = 0;

        for (int i = 10; i <= 1000; i++) {

            int quotient = i;
            int remainder = 1;
            int revnum = 0;


            while (quotient != 0) {
                remainder = quotient % 10;
                revnum = (revnum * 10) + remainder;
                quotient /= 10;
            }

            if (revnum == i) {
                System.out.print(i + ",");
                count++;
            }

        }
        System.out.println();
        System.out.println("Count: "+count);
    }
}
