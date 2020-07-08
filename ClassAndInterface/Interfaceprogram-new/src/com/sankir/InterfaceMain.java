package com.sankir;

public class InterfaceMain {
    public static void main(String[] args) {

        Operations op = new Operations();

        int res = op.sum(10, 20);
        System.out.println("Sum is: " + res);

        int sq = op.square(5);
        System.out.println("Square is: " + sq);

        int cb = op.cb(5);
        System.out.println("Cube is : " + cb);

        int fact = op.getFactorial(5);
        System.out.println("Factorial is: " + fact);

        int pr = op.product(5, 9);
        System.out.println("The Product is :" + pr);
    }
}
