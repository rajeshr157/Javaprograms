package com.sankir;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be reversed");
        int num =  sc.nextInt();


        int quotient=num;

        System.out.print("The reverse of "+num+" is: ");
        while (quotient!=0){
            int rem=quotient%10;
            quotient=quotient/10;
            System.out.print(rem);

        }
    }
}
