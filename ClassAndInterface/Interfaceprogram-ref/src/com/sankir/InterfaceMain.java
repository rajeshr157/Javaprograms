package com.sankir;

public class InterfaceMain {
    public static void main(String[] args) {

        Operations op = new Operations();

        int res = op.sum(10,20);
        System.out.println("Sum is: "+ res);

        int sq = op.square(5);
        System.out.println("Square is: " + sq);
    }
}
