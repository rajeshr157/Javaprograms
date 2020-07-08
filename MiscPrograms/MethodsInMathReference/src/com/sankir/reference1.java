package com.sankir;

public class reference1 {
    public static void main(String[] args) {
        // square root
        double sqrt = Math.sqrt(100);
        System.out.println("Square root is :" + sqrt);

        // floor
        double number = Math.floor(25.9);
        System.out.println("Lower number is :" + number);

        // round off
        double round = Math.round(25.9);
        System.out.println("Round number is :" + round);

        // to the power off
        double square = Math.pow(5.0, 2.0);
        System.out.println("Square is : " + square);

        double res = 0.0, floor = 0.0;


        System.out.println();
        for (double d = 1.0; d < 100.0; d++) {
//            res = Math.sqrt(d);
//
//            floor = Math.floor(res);
//
//            if ((res - floor) == 0.0)
//                System.out.println(d);


            if (((Math.sqrt(d) - (Math.floor(Math.sqrt(d))) == 0.0)))
                System.out.println(d);
        }
    }
}
