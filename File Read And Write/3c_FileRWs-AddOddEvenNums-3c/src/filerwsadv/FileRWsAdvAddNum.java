// Copyright @ SanKir Technologies, 2018 - Java Programming -File Read Write.
package filerwsadv;

import java.io.*;


// Program reads all the lines of inputfile.txt and copies to outptfile.txt
// matchfile is created with only lines containing matchword

public class FileRWsAdvAddNum {


    public static void main(String args[]) {

        // Read a file and print the lines of file
        System.out.println();
        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\numbers.txt";

        String filecontents = "";
        int oddSum = 0, evenSum = 0;
        int num = 0;

        // first tsak is get the file contents into program - content is in String format
        Filerd fileread = new Filerd();
        filecontents = fileread.readFromFile(filepath);  // read file contents / lines
        System.out.println("Content of first read file- \n" + filecontents);

        String[] lines = filecontents.split("\n"); // all the lines are seperated and put into String []

        // Now break each line into words using dilemeter ,
        // Ex:
        // lines[0] - 1,7,12,35,41,64,06,73,08,-7,10          // first line - whole line is single string
        // words[] -= { 1,7,12,35,41,64,06,73,08,-7,10  }    // array of strings

        for (String str : lines) { // for all lines - loop starts
            String[] words = str.split(",");
            int lineevensum = 0;
            int lineoddsum = 0;

            // now add words - using String to Integer conversion
            for (String s : words) {    // for all words - loop starts here
                num = Integer.parseInt(s);
                //System.out.print(num +",");
                if ((num % 2) == 0) {
                    evenSum += num;
                    lineevensum += num;
                }
                else {
                    oddSum += num;
                    lineoddsum += num;
                }

                /*if(Math.cbrt(num)- Math.floor(Math.cbrt(num))==0)
                    System.out.println(num);
                    */
                // System.out.println("Its a cbrt number : " +num);
            }  // for all words - loop ends here

        }  // for al lines - loop ends

        System.out.println();
        System.out.println("The sum of Even numbers is : " + evenSum);
        System.out.println("The sum of Odd numbers is : " + oddSum);

    }

}



