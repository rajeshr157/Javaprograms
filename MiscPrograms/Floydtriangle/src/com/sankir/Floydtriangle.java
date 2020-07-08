package com.sankir;

import java.util.Scanner;

public class Floydtriangle {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows required");

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        System.out.println();

        System.out.println("Enter the number to search for");
        int search = sc.nextInt();

        int rowsum = 0;
        int lastnum = 0;
        int prevlast = 1;
        int rownum = 0;
        int colnum = 0;

        System.out.println();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                lastnum = lastnum + 1;
                System.out.print(lastnum + " ");
            }

            System.out.println();

            if (search > prevlast && search <= lastnum) {
                colnum = search - prevlast;
                rownum = i;
            }

            prevlast = lastnum;
        }

        System.out.println();

        System.out.println("The number which was searched is: " + search + ". The row number is- " + rownum + ", and the column number is- " + colnum);

    }
}



