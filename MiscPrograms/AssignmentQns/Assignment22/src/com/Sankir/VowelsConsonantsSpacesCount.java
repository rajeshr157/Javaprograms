package com.Sankir;

import java.util.Scanner;

public class VowelsConsonantsSpacesCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the line");
        String input = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        int digits = 0;
        int others = 0;

        System.out.println();

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) == 'a') | (input.charAt(i) == 'e') | (input.charAt(i) == 'i') | (input.charAt(i) == 'o') | (input.charAt(i) == 'u'))
                vowels++;
            else if (Character.isDigit(input.charAt(i)))
                digits++;
            else if ((input.charAt(i) == ' '))
                spaces++;
            else if (Character.isAlphabetic(input.charAt(i)))
                consonants++;
            else
                others++;
        }

        System.out.println("vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
        System.out.println("Digits: " + digits);
        System.out.println("Others: " + others);
    }
}

