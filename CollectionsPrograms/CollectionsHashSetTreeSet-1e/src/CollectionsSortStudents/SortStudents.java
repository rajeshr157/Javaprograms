package CollectionsSortStudents;

// Example to show usage of HashSet, TreeSet  loading arraylist to hashset and treeset

import java.util.*;

public class SortStudents {

    public static void main(String args[]) {


        System.out.println("Loading Hashset and Tresset through ArrayList");

        String[] sarr2 = {"Vishal", "Umesh", "Smaran", "Shashi", "Mahesh", "Yash", "amith",
                "Vishal", "Rahul", "smaran", "Shashi", "Sudheep", "Yash", "Seema",
                "Vishal", "Umesh", "Smaran", "Shashank", "Ramesh", "Yash", "amith",
                "Vishal", "vishal", "Rahul", "Shashi", "Shashi", "Shashank", "Yash", "Seema"};


        //ArrayList<String> arrayListstudents = new ArrayList<String>();
        ArrayList<String> arrayListstudents = new ArrayList<>();
        arrayListstudents.addAll(Arrays.asList(sarr2));
        System.out.println("\nArrayList AS IS order:\n" + arrayListstudents);

        // HashSet loaded through ArrayList
        HashSet<String> hashSetstudents2 = new HashSet<>(arrayListstudents);
        System.out.println("\nHashset - Duplicates removed but not sorted - thru loading Arraylist method");
        System.out.println(hashSetstudents2);

        // TreeSet loaded through ArrayList
        TreeSet<String> treeSetstudents2 = new TreeSet<String>(arrayListstudents);
        System.out.println("\nTreeset - Duplicates removed and sorted - thru loading Arraylist method");
        System.out.println(treeSetstudents2);

    }

}


