package come.sankir;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        String infilepath = "F:\\Sankir\\Javaprograms\\Datasets\\hashsetstudent.csv";

        FileRead fr = new FileRead();
        String filecontents = fr.readFile(infilepath);

        String[] lines = filecontents.split("\n");

        HashSet<Student> records = new HashSet<>();

        int duplicates = 0;
        System.out.println();
        System.out.println("Duplicate entries are: ");
        for (String s : lines){
            String[] words = s.split(",");

            Student obj = new Student(Integer.parseInt(words[0]), words[1], Double.parseDouble(words[2]));

            if (records.add(obj)==false){
                System.out.println(obj);
                duplicates++;
            }
        }

        System.out.println();
        System.out.println("Hashset records are: ");

        records.forEach(i ->{
            System.out.println(i);
        });
        System.out.println("Count: " + records.size());

        System.out.println();
        System.out.println("Duplicates count: " + duplicates);

        System.out.println();
        System.out.println("Total records: " + (duplicates + records.size()));

    }
}
