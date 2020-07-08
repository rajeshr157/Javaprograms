package CollectionsSortStudents;
// Example to show usage of Arraylist, HashSet, TreeSet

import java.util.*;

public class HashSetTreeSet {

    public static void main(String args[]) {

        String[] sarr = {"Vishal", "Umesh", "Smaran", "Shashi", "Mahesh", "Yash", "amith",
                "Vishal", "Rahul", "smaran", "Shashi", "Sudheep", "Yash", "Seema",
                "Vishal", "Umesh", "Smaran", "Shashank", "Ramesh", "Yash", "amith",
                "Vishal", "vishal", "Rahul", "Shashi", "Shashi", "Shashank", "Yash", "Seema"};

        // Load the data into ArrayList
        ArrayList<String> arrayListstudents = new ArrayList<>();
        arrayListstudents.addAll(Arrays.asList(sarr));
        System.out.println("Arraylist of Stduents - AS IS order:\n" + arrayListstudents);
        System.out.println("ArrayList size " + arrayListstudents.size());

        // Load the data into HashSet
        // first method - individually add to count the duplicates
        // second method - thru addAll
        System.out.println();
        HashSet<String> hashSetstudents = new HashSet<String>();
        hashSetstudents.addAll(Arrays.asList(sarr));
        System.out.println("Hashset - Duplicates removed but not sorted - thru addAll method");
        System.out.println(hashSetstudents);
        System.out.println("Hashset size " + hashSetstudents.size());

        System.out.println();
        int sizediff = arrayListstudents.size() - hashSetstudents.size();

        System.out.println("no of duplicates through difference in ArrayList and HashSet size : "
                + arrayListstudents.size() + "-" + hashSetstudents.size() + "= " + sizediff);


        System.out.println();
        //hashSetstudents.clear();
       // System.out.println("Hashset size after clear " + hashSetstudents.size());
//
        // alternatively it can be done like this - add individually
       // but odnt do both as all String eleemnts are already above
        HashSet<String> hashSetstudents2 = new HashSet<String>();
//    OR calculate duplicates as follows // ensure hashsetstudents is clared for new additions
        System.out.println();
        int duplicates = 0;
        for (String s : sarr) {
            if ((hashSetstudents2.add(s)) != true)
                duplicates++;
        }
        System.out.println("no of duplicates thru hashset thru add each element: " + duplicates);

        // Load all the Names into HashSet studentset thru addall method


        // Load the data into TreeSet
        // first method - individually add to count the duplicates
        // second method - thru addAll

        System.out.println();
        System.out.println();
        TreeSet<String> treeSetstudents = new TreeSet<String>();
        treeSetstudents.addAll(Arrays.asList(sarr));
        System.out.println("Treeset - Duplicates removed and sorted  - thru addAll method");
        System.out.println(treeSetstudents);

//        System.out.println();
//        duplicates = 0;
//        for (String s : sarr) {
//            if ((treeSetstudents.add(s)) != true)
//                duplicates++;
//        }
//        System.out.println("no of dulicates thru treeset: " + duplicates);

    }
}