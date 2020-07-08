package com.sankir;

import java.util.Scanner;

public class StringCaseMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String input = sc.nextLine();

        System.out.println("Enter the character 'U'or'L' only");
        char option = sc.next().charAt(0);

        System.out.println(userinout(input,option));

    }

    public static String userinout(String input, char option){

        if ((option == 'U')|(option == 'u')){
            return input.toUpperCase();
        }
        else if ((option == 'L')|(option == 'l'))
            return  input.toLowerCase();
        else
            return "Invalid option";
    }
}
