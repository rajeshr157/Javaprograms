package com.sankir;

public class Test4 {
    static int val = 10;
    static final int count = 100;

    public static void main(String[] args) {
        int i = 20, j = 10;

        int result = sum(i, j);
        System.out.println("The sum is " + result);

        System.out.println();

        result = diff(i, j);
        System.out.println("The difference is " + result);

        System.out.println();
        result = prod(i, j);
        System.out.println("The product is " + result);

        System.out.println();
        result = div(i, j);
        System.out.println("The quotient is " + result);

        System.out.println(Test4.val);
        System.out.println(Test4.count);

    }

    static int sum(int a, int b) {
        val = val + 5;
        return a + b;
    }

    static int diff(int a, int b) {
        System.out.println(val);
        return a - b;
    }

    static int prod(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }
}
