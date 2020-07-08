package com.sankir;

import java.util.Arrays;

public class StringArrayTest {
    public static void main(String[] args) {
        String[] names = {"Rajesh", "Shyam", "Dileep", "Ramesh", "Suresh", "Joe", "Joy", "Kumar", "Suraj", "Kiran", "Sam"};

        System.out.println();
        System.out.println(names[2] + ". And the length of array is- " + names.length);
        System.out.println();

        for (int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");

        System.out.println();
        System.out.println();

        for (String val : names)
            System.out.print(val + " ");

        System.out.println();

        for (String val : names) {
            if (val.charAt(0) == 'S')
                System.out.print(val + ", ");

        }

        System.out.println();
        System.out.println("Sorted array is: ");

        Arrays.sort(names);
        for (String val : names)
            System.out.print(val + " ");

        String company = "Sankir Technologies Pvt. Ltd. Jayanagar Bengaluru Karnataka India";
        String[] words = company.split(" ");

        System.out.println();

        for (String val : words) {
            System.out.println(val + " & The string Length is- " + val.length());
            System.out.println();
        }

        String[] array2 = new String[10];
        array2[0] = "Kiran";
    }
}
