package com.sankir;

import java.util.Scanner;

public class DigitSeparation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string from which the digits are to be separated.");
        String input = sc.nextLine();

        for (int i=0; i<input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                System.out.print(input.charAt(i));

            }
        }
    }

}
