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

    TreeMap<Integer, ArrayList<Student>> treestudentmap = new TreeMap<Integer, ArrayList<Student>>();

    treestudentmap.put(255, propel);
    treestudentmap.put(11, ignite);
    System.out.println("\n*** Show usage of TreeMap thru forEach***");

    treestudentmap.forEach((key,val) -> {
      System.out.println("Key value is : " + key);
      System.out.println(val);
    });
    // Treemap syntax is TreeMap(Key, Value); Key has to be Unique. So you have to put all students in that batch
    // in this case key value 11 which  - ignite batch and value will be list of student objects
    // Key, Value ; Value is ArrayList <Student>.
    // So when you get the value thruough key, t returns ArrayList<String>.
    // For small key vlaues hashmap sorts,. so give big key vlaues to understand.

    System.out.println();

    System.out.println("List 1= " + "ignite Students thru TreeMap: " + treestudentmap.get(11));
    System.out.println("List 2= " + "propel Students thru TreeMap: " + treestudentmap.get(255));

  }
}


