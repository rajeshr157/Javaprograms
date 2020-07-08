package com.sankir;

public class AbsoluteDiagonalDifference {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4}, {4, 5, 6, 7}, {9, 8, 9, 10}, {11, 12, 13, 15}};
        int pdsum = 0;
        int sdsum = 0;
        int absdif = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (i == j)
                    pdsum = pdsum + matrix[i][j];
            }
        }

        int k = matrix.length - 1;

        for (int i = 0; i < matrix[0].length; i++) {

            sdsum = sdsum + matrix[i][k];
            k--;
        }

        System.out.println("Sum of Principle diagonal elements is: " + pdsum);
        System.out.println("Sum of Secondary diagonal elements is: " + sdsum);

        absdif = Math.abs(pdsum - sdsum);
        System.out.println();
        System.out.println("Their absolute difference is: "+ absdif);

    }
}
