package com.sankir;

public class EvenOddSumAverage {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 2};

        int oddsum = 0;
        double oddcount = 0;

        double evensum = 0;
        int evencount = 0;

        for (int val : arr) {
            if (val % 2 == 0) {
                evensum += val;
                evencount++;
            } else {
                oddsum += val;
                oddcount++;
            }
        }

        double evenavg = (evensum / evencount);
        double oddavg = (oddsum / oddcount);

        System.out.println();
        System.out.printf("The Sum and Average of even numbers in the given array are: " + evensum + " and : %3.3f respectively", evenavg);
        System.out.println();
        System.out.printf("The Sum and Average of odd numbers in the given array are: " + oddsum + " and: %3.3f respectively",oddavg);
    }
}
