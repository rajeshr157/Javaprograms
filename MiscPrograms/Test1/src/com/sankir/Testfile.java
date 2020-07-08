package com.sankir;

public class Testfile {
    public static void main(String[] args) {
        System.out.println("Hello world it's thursday today");

        System.out.println();

        int num = 10;
        String name = "Rajesh";
        System.out.println("The given number is" + num + "the name is " + name);

        if (num % 2 == 0)
            System.out.println("The given number is even");
        else
            System.out.println("The given number is odd");

        for (int i = 1; i < 10; i++)
            System.out.print(i + ",");

        System.out.println();

        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0)
                System.out.print(i + ",");
        }
        System.out.println();

        for (int i = 0; i < 101; i += 5)
            if (i % 5 == 0)
                System.out.print(i + ",");

        System.out.println();

        int number = 1;
        while (number <= 100) {
            if (number % 5 == 0)
                System.out.print(number + ",");
            number++;
        }
    }
}