package com.sankir;

public class StringLengthWordCount {

    public static void main(String[] args) {

        String[] sarray = {"First line of file", "Second week", "Third month of the year 2020", "Fourth Semester of the Computer science in College",
                "Fifth avenue in the downtown"};

        for (String s : sarray) {

            String[] words = s.split(" ");
            System.out.println("The length of String- '" + s + "', is: " + s.length() + " & word count is: " + words.length);
        }
        System.out.println(sarray.length);

    }
}