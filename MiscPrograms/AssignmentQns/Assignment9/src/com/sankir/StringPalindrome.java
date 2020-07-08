package com.sankir;

import org.omg.CORBA.SetOverrideType;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to be checked");
        String inputstr = sc.nextLine();

        System.out.println("Input string: "+ inputstr);

        String wospace = inputstr.replaceAll("\\s", "");

        System.out.println("wospace: "+ wospace);

        String alphanum=wospace.replaceAll("[^a-zA-Z0-9 _-]", "");

        System.out.println("Alphanum: "+alphanum);

        String original = alphanum.toLowerCase();

        int stringlength = original.length();

        String reversestr = "";


        for (int i = 0; i < stringlength; i++) {

            reversestr = reversestr + original.charAt(stringlength - 1 - i);

        }
        if (reversestr.equalsIgnoreCase(original))
            System.out.println("It's a Palindrome");

        else
            System.out.println("It's not a palindrome");

        System.out.println(original);
        System.out.println(reversestr);

    }
}