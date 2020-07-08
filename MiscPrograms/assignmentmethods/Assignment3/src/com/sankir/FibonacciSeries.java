package com.sankir;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cut-off element required in the fibonacci series");
        int lastnum = sc.nextInt();


        System.out.println();
        System.out.print("The number of elements in the series is: 0, 1, ");
        fibonacci(lastnum);



    }

    public static void fibonacci(int cutoff) {

        int newnum = 1;
        int count = 2;
        int firstref = 0;
        int secondref = 1;

        while (secondref <= cutoff) {

            newnum = firstref + secondref;
            if (newnum <= cutoff) {

                count++;

                System.out.print(newnum+", ");


                firstref = secondref;
                secondref = newnum;
            } else
                break;

        }
        System.out.println();
        System.out.print("The number of elements in the series is : "+ count);


    }
}
