package filerwintohashset;

import java.io.*;
import java.util.*;


//  Hashset example.
//


public class Hashset {

    public static void main(String args[]) {

        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\hashsetstudent.csv";
        ArrayList<String> linesRead = new ArrayList<String>();


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

        int duplicatescount = 0;
        int size = linesRead.size();
        System.out.println("The size of Arraylist in which lines from file are read is " + size + "\n");
        System.out.println("Now printing String Values again directly thru call to print strings of ArrayList");
        System.out.println(linesRead);

        //using enhanced loop
        HashSet<Student> records = new HashSet<Student>();
        Student sobj;
        System.out.println();
        System.out.println("Duplicate Objects are : ");
        for (String s : linesRead) {

            String[] words = s.split(","); //this splits the line based on "," as delimiter
            //words[0] will be rollno, words[1] will be name and words[2] will be age
            sobj = new Student(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]));

            if (records.add(sobj) == false) {// Objects are added to Hashset
                duplicatescount++;
                System.out.println(sobj); // print the duplicate objects not added
            }
        } // for loop ends here

        System.out.println();
        System.out.println("Total no of records : " + size);
        System.out.println("No of duplicates is : " + duplicatescount);
        System.out.println("The size of Hashset is " + records.size() + "\n");
        System.out.println();
        System.out.println("Use toString method format to print hashset objects");
        System.out.println(records);


    }
}

