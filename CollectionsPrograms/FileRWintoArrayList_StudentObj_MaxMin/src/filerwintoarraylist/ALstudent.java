package filerwintoarraylist;

import java.io.*;
import java.text.CollationElementIterator;
import java.util.*;


// Program reads all the lines of blrstudent2.csv
// loads student atrributes to Student object - to be done as assignment

public class ALstudent {

    public static void main(String args[]) {

        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\arrayliststudentmaxmin.csv";

        // Read all thr lines of file into linesread obj which is object to ArrayList<string> class
        FileRd fr = new FileRd();
        String filecontent = fr.readFromFile(filepath);

        // Get all the lines of file into String
        String[] lines = filecontent.split("\n");

        // Load all the lines into ArrayList
        ArrayList<String> linesRead = new ArrayList<String>();
        linesRead.addAll(Arrays.asList(lines));
        System.out.println("Lines inside ArrayList");
        System.out.println(linesRead);

        // Create Objects
        ArrayList<Student> records = new ArrayList<Student>();
        Student sobj; // to intialise the object from words of each line read // Initilaize objects with words split from line read

        for (String s : linesRead) {
            String[] values = s.split(","); //this splits the line based on "," as delimiter
            //values[0] will be rollno, values[1] will be name and values[2] will be age
            sobj = new Student(Integer.parseInt(values[0]), values[1], Integer.parseInt(values[2]), Double.parseDouble(values[3]));
            records.add(sobj); // add the initialised Student Object to Arraylist

        } // for loop ends here

        int size = records.size();
        System.out.println("\nThe size of Arraylist in which Student Objs are stored is " + size + "\n");

        Student element; // to capture the Object matching criteria.

        System.out.println("Using Collections.max and Collections.min : \n");
        element = Collections.max(records, Comparator.comparingDouble(Student::getMarks));
        System.out.println("Student Details with Max Marks is  : ");
        System.out.println(element);

        // Find Min Marks student details
        System.out.println();
        element = Collections.min(records, Comparator.comparingDouble(Student::getMarks));
        System.out.println("Student Details with Min Marks is  : ");
        System.out.println(element);

// Find Max Age student details
        System.out.println();
        element = Collections.max(records, Comparator.comparingInt(Student::getAge));
        System.out.println("Student Details with Max age is  : ");
        System.out.println(element);


        // Find Min Age student details
        System.out.println();
        element = Collections.min(records, Comparator.comparingInt(Student::getAge));
        System.out.println("Student Details with Min age is  : ");
        System.out.println(element);


        // Find Alphabetically Last name student details
        System.out.println();
        element = Collections.max(records, Comparator.comparing(Student::getName));
        System.out.println("Student Details with Alphabetically Last name is  : ");
        System.out.println(element);


        // Find Alphabetically First name student details
        System.out.println();
        element = Collections.min(records, Comparator.comparing(Student::getName));
        System.out.println("Student Details with Alphabetically First name is  : ");
        System.out.println(element);


    }
}



