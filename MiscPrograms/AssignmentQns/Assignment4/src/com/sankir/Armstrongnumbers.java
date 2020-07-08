package com.sankir;

public class Armstrongnumbers {
    public static void main(String[] args) {


        for (int i = 0; i < 1000; i++) {
            if (i == ((Math.pow((i % 10), 3)) + (Math.pow(((i / 10) % 10), 3)) + (Math.pow(((i / 100) % 10), 3))))
                System.out.print(i + ",");
            else
                continue;

        }
    }
}

