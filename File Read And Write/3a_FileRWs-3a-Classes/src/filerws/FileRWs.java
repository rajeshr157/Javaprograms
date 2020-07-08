// Copyright @ SanKir Technologies, 2018 - Java Programming -File Read Write.
package filerws;

import java.io.*;


// Program reads all the lines of inputfile.txt and copies to outptfile.txt
// matchfile is created with only lines containing matchword

public class FileRWs {


    public static void main(String args[]) {

        // Read a file and print the lines of file
        System.out.println();
        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\inputfile.txt";
        //String filepath=filepath1;
        String filecontents = "";

        FileRd fileread = new FileRd();
        filecontents = fileread.readFromFile(filepath);

        System.out.println("Lines read from File ");
        System.out.println(filecontents);
        //System.out.println("odd lines matching is : " + nooflines);

        System.out.println("Now writing to file ");
        String filepath1 = "F:\\Sankir\\Javaprograms\\Datasets\\outputfile.txt";
        // String filepath1 = "D:\\1-Data Leap\\1-DATASETS\\outputfileThis.txt";

        FileWr filewrite = new FileWr();
        filewrite.writeToFile(filepath1, filecontents);

    }


}
