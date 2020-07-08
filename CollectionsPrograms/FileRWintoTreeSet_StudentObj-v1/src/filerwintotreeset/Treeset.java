package filerwintotreeset;

import java.io.*;
import java.util.*;


// Program reads all the lines of blrstudent2.csv
// loads student atrributes to Student object - to be done as assignment

public class Treeset {

    public static void main(String args[]) {

        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\treesetstudent.csv";
        ArrayList<String> linesRead = new ArrayList<String>();

        TreeSet<Student> records = new TreeSet<Student>();
        //TreeSet<Student> records[] = new TreeSet<Student>[0]; // Generics Array not allowed

        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String currentline = br.readLine();

            while (currentline != null) {
                linesRead.add(currentline);// Add line to String Arraylist
                currentline = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int duplicatescount = 0, duplicates=0;
        int size = linesRead.size();
        System.out.println("The size of Arraylist in which lines from file are read is " + size + "\n");
        System.out.println("Now printing String Values again directly thru call to print strings of ArrayList");
        System.out.println(linesRead);


        System.out.println("\n Duplicate objects are :");
        Student sobj;
        for (String s : linesRead) {

            String[] words = s.split(","); //this splits the line based on "," as delimiter
            //words[0] will be rollno, words[1] will be name and words[2] will be age

                sobj = new Student(Integer.parseInt(words[0]), words[1],
                        Integer.parseInt(words[2]), Double.parseDouble(words[3]));

                //records.add(sobj);

                // though student class implements Comparable<Student>
                if (records.add(sobj) == false) { // Objects are added to Treeset
                    duplicatescount++;
                    System.out.println(sobj);
                }

            //records.add(sobj); // Objects are added to Treeset

        } // for loop ends heree

        System.out.println("\nThe size of List is " + size);
        System.out.println("The number of Duplicate elements is " + duplicatescount);
        System.out.println("The size of Treeset is " + records.size() + "\n");

        System.out.println("Use toString method format to print treeset objects");
        System.out.println(records);



    }
}

