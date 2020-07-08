package com.sankir;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        String company = "Sankir Technologies";

        int l = company.length();
        char ch = company.charAt(0);
        String lc = company.toLowerCase();
        String uc = company.toUpperCase();

        System.out.println("The length of string is " + l);

        System.out.println("The first letter of the string is " + ch);

        System.out.println("The entered string in lower case is " + lc);
        System.out.println("The entered string in upper case is " + uc);

        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

        System.out.println();


        int sumeven = 0;
        int sumodd = 0;

        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0)
                sumeven = sumeven + i;
            else
                sumodd = sumodd + i;
        }
        System.out.println("The sum of all even numbers upto 100 is "+ sumeven);
        System.out.println();
        System.out.println("The sum of all odd numbers upto 100 is "+ sumodd);

    }
}
