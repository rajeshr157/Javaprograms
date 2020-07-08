package com.sankir;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraytest {
    public static void main(String[] args) {

        int[] numbers = {2, 48, 56, 74, 35, 65, 14, 35, 29, 64, 96, 58, 59};

        System.out.println(numbers[2] + " Length of array-" + numbers.length);

        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");

        System.out.println();

        for (int val : numbers)
            System.out.print(val + " ");

        System.out.println();

        for (int val : numbers) {
            if (val % 2 == 0)
                System.out.print(val + ",");

        }

        System.out.println();
        System.out.println("Sorted array");

        Arrays.sort(numbers);
        for (int val : numbers)
            System.out.print(val+" ");

    }
}

