package CollectionsMapStudents;

// Example to show usage of HAshmMap

import java.util.*;

public class MapStudents {

    public static void main(String args[]) {

        String[] ignitestudents = {"Umar", "Suprith", "Shashank", "Sindhu", "Pooja"};
        String[] propelstudents = {"Varun", "Sharath", "Ganesh", "Manjunath", "Mallikarjun", "Akash"};
        String[] traineestudents = {"Chandana", "chandan", "varshini", "Priya", "Shivesh", "Bharath", "Spoorthi", "Haithaishi"};
        String[] internstudents = {"Amit", "Anusha", "Smaran", "Rohit", "Adithya", "Rohit", "Surabhi"};

        ArrayList<String> ignite = new ArrayList<String>();
        ArrayList<String> propel = new ArrayList<String>();
        ArrayList<String> trainee = new ArrayList<>();
        ArrayList<String> intern = new ArrayList<String>();

        ignite.addAll(Arrays.asList(ignitestudents));
        propel.addAll(Arrays.asList(propelstudents));
        trainee.addAll(Arrays.asList(traineestudents));
        intern.addAll(Arrays.asList(internstudents));

        System.out.println("\n*** Show usage of TreeMap***");

        // Treemap syntax is Treemap(Key, Value); Key has to be Unique. So you have to put all students in that batch
        // in this case key value 1 which is batch 1 - ignite and value will be list of students
        // Now put values into Treemap
        TreeMap<Integer, ArrayList<String>> treestudentmap = new TreeMap<Integer, ArrayList<String>>();

        treestudentmap.put(2020, intern);
        treestudentmap.put(10, ignite);
        treestudentmap.put(3030, trainee);
        treestudentmap.put(1010, propel);
        //  thought key vales are different, same String List is referred and not mainatined copy.
        // So if reference changes, then key associated with that lists changed values.

        treestudentmap.forEach((key,val) -> {
            System.out.println("Key value is : " + key);
            System.out.println(val);
            });

//        System.out.println("TreeMap");
//        System.out.println(treestudentmap);

        System.out.println();
        System.out.println("List 1= " + "ignite Students thru TreeMap: " + treestudentmap.get(10));
        System.out.println("List 2= " + "propel Students thru TreeMap: " + treestudentmap.get(1010));
        System.out.println("List 3= " + "intern Students thru TreeMap: " + treestudentmap.get(2020));
        System.out.println("List 4= " + "trainee Students thru TreeMap: " + treestudentmap.get(3030));
        System.out.println();

        Collections.sort(treestudentmap.get(1010));
        System.out.println("TreeMap : List 2 - propel Students sorted thru collections.sort ");
        System.out.println(treestudentmap.get(1010));
        System.out.println();

    }
}


