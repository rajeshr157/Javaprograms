package com.sankir;

public class EmirphNumber {
    public static void main(String[] args) {

        int flag = 1;

        for (int i = 11; i <= 1000; i++) {

            flag = 1;

            for (int j = 2; j < i; j++) {

                if (i % j == 0)
                    flag = 0;

            }

            if (flag == 1) {

                int quotient = i;
                int remainder = 1;
                int revi = 0;

                while (quotient != 0) {
                    remainder = quotient % 10;
                    revi = (revi * 10) + remainder;
                    quotient = quotient / 10;
                }

                int revflag = 1;

                for (int k = 2; k < revi; k++) {

                    if (revi % k == 0)
                        revflag = 0;


                }
                if (revflag == 1)
                    System.out.print(i + ",");

            }


        }

    }
}
