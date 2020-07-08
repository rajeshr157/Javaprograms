// Copyright @ SanKir Technologies, 2018 - Java Programming -File Read Write.
package filerws;

import java.io.*;


// Program reads all the lines of inputfile.txt and copies to outptfile.txt
// matchfile is created with only lines containing matchword

public class FileRWs {


    public static void main(String args[]) {

        // Read a file and print the lines of file
        System.out.println();
        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\students.csv";
        //String filepath=filepath1;
        String filecontents = "";

        FileRd fileread = new FileRd();
        filecontents = fileread.readFromFile(filepath);

        System.out.println(filecontents);

        String[] lines = filecontents.split("\n");
        // After reading file, total student lines is needed.
        Student[] records = new Student[lines.length];

        String[] values;
        Student sobj;
        int rollno, age, marks;
        String name;

        // Initialise Objects
        int index = 0;
        for (String str : lines) {
            values = str.split(",");

            rollno = Integer.parseInt(values[0]);
            age = Integer.parseInt(values[1]);
            name = values[2];
            marks = Integer.parseInt(values[3]);

            sobj = new Student(rollno, age, name, marks);

//           sobj = new Student(Integer.parseInt(values[0]), Integer.parseInt(values[1]),
//                    values[2], Integer.parseInt(values[3]));

            System.out.println(sobj);
            records[index] = sobj;
            index++;
        }

        //
        // Read the lines from file - String [] lines
        // split each line - get individual fields - populate the Student Object using these fields
        // add each Student object to Student [] records

        System.out.println("\nPrinting thru Object array");
        for (Student st : records)
            System.out.println(st);

        String outputfilecontent = "";
        System.out.println("\n Get all the students with marks > 80 ");
        for (Student st : records) {
            if (st.getMarks() > 80) {
                outputfilecontent += (Integer.toString(st.getRollno()) + "," +
                    Integer.toString(st.getAge()) + "," +
                    st.getName() + "," +
                    Integer.toString(st.getMarks()) +
                    "\n");
            }
        }
            // Build the String containing matching records

        //System.out.println("records matching are : " + nooflines);
        System.out.println("Now writing to file - all the macthing records ");
        String filepath1 = "F:\\Sankir\\Javaprograms\\Datasets\\outputstudents.csv";
        // String filepath1 = "D:\\1-Data Leap\\1-DATASETS\\outputfileThis.txt";

        FileWr filewrite = new FileWr();
        filewrite.writeToFile(filepath1, outputfilecontent);


    }


}
