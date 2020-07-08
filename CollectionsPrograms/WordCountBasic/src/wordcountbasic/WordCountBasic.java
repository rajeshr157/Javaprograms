package wordcountbasic;

// Example to show usage of Arraylist, HashSet, TreeSet


import java.util.*;

public class WordCountBasic {

    public static void main(String args[]) {

        String[] sarr = {"Vishal Hiremath", "Umesh", "Smaran", "Shashi", "Yash", "Vishal", "Yash",
                "amith", "smaran", "Rahul", "Shashi", "Yash", "Yash", "smaran",
                "Vishal", "Umesh", "Smaran", "Shashi", "Yash", "Vishal", "Yash",
                "amith", "smaran", "Rahul", "Shashi", "Yash", "Yash", "smaran",
                "Vishal", "Umesh", "Smaran", "Shashi", "Yash", "Vishal", "Yash",
                "amith", "smaran", "Rahul", "Shashi", "Yash", "Yash", "smaran"};

        ArrayList<String> arrayListstudents = new ArrayList<>();

        // Load all the Names into ArrayList studentset thru addall method
        System.out.println("Arraylist of Stduents  - All records are as is -");

        System.out.println();
        arrayListstudents.addAll(Arrays.asList(sarr));
        System.out.println(arrayListstudents);


        // task1
        int res = Collections.frequency(arrayListstudents, "Vishal");
        System.out.println("count of vishal : " + res);

        /*System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word whose count is needed");
        String ui = sc.next();

        int num = Collections.frequency(arrayListstudents, ui);
        System.out.println("count of " + ui + " is: " + num);
*/
        // Find the frequency of these words in array

// task 2:
        String words[] = {"Vishal", "Yash", "amith", "Shashi"};
        //Integer wordscount[] = new Integer[words.length];
        //int count=0;

        ArrayList<Integer> wordscount = new ArrayList<>();
        int result1 = 0;

        // use Utility frequency
        for (String s : words) {
            //wordscount[count] = Collections.frequency(arrayListstudents, s);
            // count++;
            result1 = Collections.frequency(arrayListstudents, s);
            wordscount.add(result1);
        }

        // Print the result
        System.out.println();
        System.out.println("Frequency of the Selected words - case sensitive");
        int index1 = 0;
        for (String s : words) {
            System.out.println(s + " : " + wordscount.get(index1));
            index1++;
        }

// Thru hashset
// All names are already in ArrayList
// hashset has unique names.
// Count frequency of each unique name and store the count in Integer array
// ArrayList Interger is used so that size of array is calculated automatically.

        // task 3:
        HashSet<String> hashsetnames = new HashSet<>(arrayListstudents); // get unique names
        ArrayList<Integer> namescount2 = new ArrayList<>();

        int result2 = 0;

        // use Utility frequency
        for (String s : hashsetnames) {

            result2 = Collections.frequency(arrayListstudents, s);
            namescount2.add(result2);
        }

        // Print the result
        System.out.println();
        System.out.println("Frequency of the unique words - case sensitive");
        int index2 = 0;
        for (String s : hashsetnames) {
            System.out.println(s + " : " + namescount2.get(index2));
            index2++;
        }


        // task 4:
        TreeSet<String> treesetnames = new TreeSet<>(arrayListstudents); // get unique names
        ArrayList<Integer> namescount3 = new ArrayList<>();

        int result3 = 0;

        // use Utility frequency
        for (String s : treesetnames) {
            result3 = Collections.frequency(arrayListstudents, s);
            namescount3.add(result3);
        }

        // Print the result
        System.out.println();
        System.out.println("Frequency of the unique words - case sensitive");
        int index3 = 0;
        for (String s : treesetnames) {
            System.out.println(s + " : " + namescount3.get(index3));
            index3++;
        }



    }


}




