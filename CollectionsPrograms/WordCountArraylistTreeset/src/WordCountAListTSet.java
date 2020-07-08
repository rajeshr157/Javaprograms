import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class WordCountAListTSet {

    public static void main(String[] args) {

        ArrayList<String> aldata = new ArrayList<String>();
        String linesRead = " ";
        String words[];

        try {
            //FileReader fr = new FileReader("D:\\1-Data Leap\\1-DATASETS\\student-mat.csv"); // delimeter is ;
           //FileReader fr = new FileReader("F:\\Sankir\\Javaprograms\\Datasets\\wcfile.txt"); // delimeter is
            FileReader fr = new FileReader("F:\\Sankir\\Javaprograms\\Datasets\\BigData.txt"); // delimeter is
            //FileReader fr = new FileReader("D:\\1-Data Leap\\1-DATASETS\\Telco-Customers.csv"); // delimeter is ,
            //FileReader fr = new FileReader("D:\\1-Data Leap\\1-DATASETS\\Telco-Customers-2.csv"); // delimeter is ,
            //FileReader fr = new FileReader("D:\\1-Data Leap\\1-DATASETS\\WordCountAListTSet.java"); // delimeter is ,

            BufferedReader br = new BufferedReader(fr);

            while ((linesRead = br.readLine()) != null) {
                words = linesRead.split(" ");
                aldata.addAll(Arrays.asList(words)); // all words captured in arraylist
              /*  if (words[1].equals("Female"))
                    gendercount++;*/

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println(LocalDateTime.now());

        HashSet<String> hsdata = new HashSet<>(aldata);

        System.out.println("No of words in file : " + aldata.size());
        System.out.println("No of unique words in file : " + hsdata.size());
        // search for frequency of unique words in the list using hashset
        System.out.println("\nFrequency of unique words in the list thru hashset :\n");

        int count = 0;
        ArrayList<Integer> wordcounts = new ArrayList<>();
        //System.out.println(LocalDateTime.now());
        for (String s : hsdata) {
            int num = Collections.frequency(aldata, s);
            wordcounts.add(num);
        }

        for (String s : hsdata) {
            System.out.println(s + " = " + wordcounts.get(count));
            count++;
        }

        // Now word frequency in alphabetic order
        ArrayList<Integer> wordcounts2 = new ArrayList<>();
        count=0;
        System.out.println("\nfrequency of sorted unique words in the list thru treeset: \n");
        TreeSet<String> tsdata = new TreeSet<>(aldata);

        for (String s : tsdata) {
            int num = Collections.frequency(aldata, s);
            wordcounts2.add(num);
        }

        for (String s : tsdata) {
            System.out.println(s + " = " + wordcounts2.get(count));
            count++;
        }
      //  System.out.println(LocalDateTime.now());
    }
}