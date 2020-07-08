package com.sankir;

public class StringSumOfDigits {

    public static void main(String[] args) {

        String input = "SanKir345Tech123";

        int num = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                num += Character.getNumericValue(input.charAt(i));
                System.out.println(num);
            }
        }
        System.out.println();
        System.out.println(num);

    }


}

