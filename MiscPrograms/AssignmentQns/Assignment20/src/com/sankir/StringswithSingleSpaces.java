package com.sankir;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class StringswithSingleSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string with leading spaces");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) != ' '))
                toPrintString(input.charAt(i));
            else {
                if (input.charAt(i) == ' ') {
                    if (input.charAt(i + 1) == '.')
                        continue;
                    else if (input.charAt(i + 1) == '"')
                        continue;
                    else if (input.charAt(i + 1) != ' ')
                        toPrintSpace();

                }

            }
        }

    }

    public static void toPrintString(char character) {
        System.out.print(character);
    }

    public static void toPrintSpace() {
        System.out.print(" ");
    }
}
