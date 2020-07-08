package CollectionsSortStudents;

// Example to show usage of Arraylist, HashSet, TreeSet

import java.util.*;

public class ArrayListData {

    public static void main(String args[]) {

        // 1. Array of Elements that needs ot be loaded into ArrayList Object
        String[] sarr = {"Umesh", "Smaran", "Shashi", "Yash", "Mahesh", "Yash", "amith", "smaran", "Rahul",
                "Shashi", "Sudheep", "Yash", "Seema"};

        // 2. Declare an object to ArrayList
        ArrayList<String> arrayListstudents = new ArrayList<>();

        // 3. Load all the Names into ArrayList studentset thru addall method
        arrayListstudents.addAll(Arrays.asList(sarr));

        // 4, Print the ArrayList
        System.out.println("Print String ArrayList elements thru forEach ");
        arrayListstudents.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        // Follwoing note down - this is just to optimize the code
        // ArrayList<String> arrayListstudents = new ArrayList<>(Arrays.asList(sarr));
        // List<String> arrayListstudents = Arrays.asList("Umesh", "Smaran", "Shashi", "Yash", "Mahesh", "Yash", "amith", "smaran", "Rahul",
        //                "Shashi", "Sudheep", "Yash", "Seema");

//        System.out.println("Print String ArrayList elements thru enhanced loop ");
//        for (String s : arrayListstudents)
//            System.out.print(s + ", ");
//        System.out.println();

        System.out.println();
        System.out.println("ArrayList size is : " + arrayListstudents.size());
        System.out.println("Arraylist of Students - in AS IS order \n" + arrayListstudents);

        System.out.println("Print Arraylist elements using forEach Lambda Expression:");
        arrayListstudents.forEach(in -> {
            System.out.println(in + " - " + in.length());
        });

        System.out.println();
        System.out.println("\nArraylist of Strings - min and max");

        String first = Collections.min(arrayListstudents);
        String last = Collections.max(arrayListstudents);

        System.out.println("first name of Student List is " + first);
        System.out.println("Last name of Student List is " + last);

        arrayListstudents.remove("Mahesh");
        arrayListstudents.set(0, "Sumesh");
        System.out.println("Removed Mahesh and Modified Umesh to Sumesh");

        System.out.println();
        arrayListstudents.add(2, "John");
        arrayListstudents.add(arrayListstudents.size(), "Peter");
        arrayListstudents.add(0, "Bharath");

        System.out.println("After adding 3 elements, John at index 2, Peter at the end, Bharath at beginning");
        System.out.println(arrayListstudents);

        System.out.println();
        Collections.reverse(arrayListstudents);
        System.out.println("REVERSE order:\n" + arrayListstudents);

        System.out.println();
        System.out.println("\nSorted Students Alphabetically thru sort utility");
        Collections.sort(arrayListstudents);
        System.out.println(arrayListstudents);

        System.out.println();
        System.out.println("\nShuffled Students thru shuffle utility");
        Collections.shuffle(arrayListstudents);
        System.out.println(arrayListstudents);

    }

}


