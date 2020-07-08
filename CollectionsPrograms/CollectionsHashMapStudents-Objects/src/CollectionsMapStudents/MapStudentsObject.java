package CollectionsMapStudents;

// Example to show usage of HAshmMap

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

public class MapStudentsObject {

  public static void main(String args[]) {

    Student[] ignitestudents = {
        new Student(1, "Rohith", 95),
        new Student(2, "Adithya", 90),
        new Student(3, "Kiran", 85)
    };

    Student[] propelstudents = {
        new Student(11, "Rana", 85),
        new Student(12, "Amit", 80),
        new Student(13, "Karthik", 75)};


    ArrayList<Student> ignite = new ArrayList<>();
    ArrayList<Student> propel = new ArrayList<>();

    ignite.addAll(Arrays.asList(ignitestudents));
    propel.addAll(Arrays.asList(propelstudents));

    HashMap<Integer, ArrayList<Student>> hashstudentmap = new HashMap<Integer, ArrayList<Student>>();
    hashstudentmap.put(11, ignite);
    hashstudentmap.put(255, propel);
    System.out.println("\n*** Show usage of HashMap thru forEach***");

    hashstudentmap.forEach((key, val) -> {
      System.out.println("Key value is : " + key);
      System.out.println(val);
    });
    // hashmap syntax is HashMap(Key, Value); Key has to be Unique. So you have to put all students in that batch
    // in this case key value 11 which  - ignite batch and value will be list of student objects
    // Key, Value ; Value is ArrayList <Student>.
    // So when you get the value thruough key, t returns ArrayList<String>.
    // For small key vlaues hashmap sorts,. so give big key vlaues to understand.

    System.out.println();

    System.out.println("List 1= " + "ignite Students thru HashMap: " + hashstudentmap.get(11));
    System.out.println("List 2= " + "propel Students thru HashMap: " + hashstudentmap.get(255));

// A particular student - 1st Student marks
    // System.out.println(hashstudentmap.get(11).get(0) gets the 1st Student
    System.out.println(hashstudentmap.get(11).get(0).getMarks());

    //

  }
}


