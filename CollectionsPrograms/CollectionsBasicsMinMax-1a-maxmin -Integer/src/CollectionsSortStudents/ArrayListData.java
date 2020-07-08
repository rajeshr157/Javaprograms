package CollectionsSortStudents;

// Example to show usage of Arraylist, HashSet, TreeSet


import java.util.*;

public class ArrayListData {

    public static void main(String args[]) {

        Integer[] iarr = {13, 11, 50, 17, 19, 24, 22, 48, 36, 15};

        ArrayList<Integer> arrayListnumbers = new ArrayList<>();
        arrayListnumbers.addAll(Arrays.asList(iarr));

        //        List<Integer> arrayListnumbers = new ArrayList<>(); // can be done like this also
/*
        arrayListnumbers.add(13);
        arrayListnumbers.add(11);
        arrayListnumbers.add(50);
        arrayListnumbers.add(17);
        arrayListnumbers.add(19);
        arrayListnumbers.add(24);
        arrayListnumbers.add(22);
        arrayListnumbers.add(48);
        arrayListnumbers.add(36);
        arrayListnumbers.add(15);
        */

        // Now collections class instance is populated.
//        System.out.println("Print Integer ArrayList elements thru enhanced loop ");
//        for (Integer val : arrayListnumbers)
//            System.out.print(val + ", ");
//        System.out.println();
//

        System.out.println();
        System.out.println("Arraylist of Numbers - in AS IS order");
        System.out.println("Arraylist size is :" + arrayListnumbers.size());

        System.out.println(arrayListnumbers);

        System.out.println("Print Integer ArrayList elements thru forEach ");
        arrayListnumbers.forEach(in-> System.out.print(in+", "));
        System.out.println();

        System.out.println();
        System.out.println(arrayListnumbers.get(3));

        System.out.println();
        System.out.println(arrayListnumbers.remove(3));
        int size = arrayListnumbers.size();
        System.out.println("Arraylist size after remove is :" + size);
        System.out.println("Arraylist of Numbers - after remove");
        System.out.println(arrayListnumbers);

        System.out.println();
        arrayListnumbers.add(2, 100);  // dont give index beyond size
        size = arrayListnumbers.size();
        System.out.println("Arraylist size after add at beginning  is :" + size);
        System.out.println("Arraylist after add at begining ");
        System.out.println(arrayListnumbers);

        System.out.println();
        arrayListnumbers.add(size, 200);
        size = arrayListnumbers.size();
        System.out.println("Arraylist size after add at end  is :" + size);
        System.out.println("Arraylist after add at end " );
        System.out.println(arrayListnumbers);

        // Utilities
        System.out.println();
        System.out.println("\nArraylist of Numbers - in REVERSE order - thru utility ");
        Collections.reverse(arrayListnumbers);
        System.out.println(arrayListnumbers);

        System.out.println();
        System.out.println("\nSorted numbers thru sort utility");
        Collections.sort(arrayListnumbers);
        System.out.println(arrayListnumbers);

        System.out.println();
        System.out.println("\nShffled numbers thru shuffle utility - random");
        Collections.shuffle(arrayListnumbers);
        System.out.println(arrayListnumbers);

        System.out.println();
        System.out.println("\nArraylist of Numbers - max and min ");

        int max = Collections.max(arrayListnumbers);
        int min = Collections.min(arrayListnumbers);

        System.out.println("Maximum of Number List is " + max);
        System.out.println("Minimum of NUmber List is " + min);

        System.out.println();
        arrayListnumbers.add(0, 5);  // dont give index beyond size
        size = arrayListnumbers.size();

        System.out.println();
        System.out.println("\nSorted numbers thru sort utility again");
        Collections.sort(arrayListnumbers);
        System.out.println(arrayListnumbers);


    }

}


