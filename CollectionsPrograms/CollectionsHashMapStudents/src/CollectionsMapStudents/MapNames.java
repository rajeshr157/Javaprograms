package CollectionsMapStudents;

// Example to show usage of HAshmMap

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

public class MapNames {

    public static void main(String args[]) {

        String[] ignitenames = {"Umar", "Suprith", "Shashank", "Sindhu", "Pooja"};
        String[] propelnames = {"Varun", "Sharath", "Ganesh", "Manjunath", "Mallikarjun", "Akash"};
        String[] traineestudents = {"Chandana", "chandan", "varshini", "Priya", "Shivesh", "Bharath", "Spoorthi" };
        String[] internstudents = {"Amit", "Anusha", "Smaran", "Rohit", "Adithya", "Rohit", "Surabhi"};

        ArrayList<String> ignite = new ArrayList<String>();
        ArrayList<String> propel = new ArrayList<String>();
        ArrayList<String> trainee = new ArrayList<>();
        ArrayList<String> intern = new ArrayList<String>();

        ignite.addAll(Arrays.asList(ignitenames));
        propel.addAll(Arrays.asList(propelnames));
        trainee.addAll(Arrays.asList(traineestudents));
        intern.addAll(Arrays.asList(internstudents));

        System.out.println("\n*** Show usage of HashMap ***");

        // hashmap syntax is HashMap(Key, Value); Key has to be Unique. So you have to put all students in that batch
        // in this case key value 1 which is batch 1 - ignite and value will be list of students

        HashMap<Integer, ArrayList<String>> hashnamesmap = new HashMap<Integer, ArrayList<String>>();
        // Key, Value ; Value is ArrayList <String>.
        // SO when you get the value thruough key, t returns ArrayList<String>.

        hashnamesmap.put(255, propel);
        hashnamesmap.put(11, ignite);
        hashnamesmap.put(355, intern);
        hashnamesmap.put(555, trainee);

        System.out.println("Print the HashMap");
        hashnamesmap.forEach((key,val) -> {
            System.out.println("key value is : " + key);
            System.out.println(val);
        });

        // For small key vlaues hashmap sorts,. so give big key vlaues to understand.
        //hashnamesmap.put(255, intern); // referred propel value changed to refer to intern value - Dont do this.

        /* hashnamesmap.put(255, propel);
        hashnamesmap.put(11, propel);
        hashnamesmap.put(355, propel);
        //hashnamesmap.put(255, intern); // referred propel value changed to refer to intern value - Dont do this.
        hashnamesmap.put(555, propel); */
        // Same values can be associated with different keys also. But dont do this.

//        System.out.println("HashMap");
//        System.out.println(hashnamesmap);

        System.out.println();
        System.out.println("List 1= " + "ignite Students thru HashMap: " + hashnamesmap.get(11));
        System.out.println("List 2= " + "propel Students thru HashMap: " + hashnamesmap.get(255));
        System.out.println("List 3= " + "intern Students thru HashMap: " + hashnamesmap.get(355));
        System.out.println("List 4= " + "trainee Students thru HashMap: " + hashnamesmap.get(555));
        System.out.println();

        Collections.sort(hashnamesmap.get(11));
        System.out.println("HashMap : List 1 - ignite Students List sorted thru collections.sort ");
        System.out.println("List 1= " + "ignite Students thru HashMap after sort: " + hashnamesmap.get(11));
        System.out.println();
        System.out.println(hashnamesmap.get(11).get(2)); // 3rd element of the String Value
        System.out.println("Length : " + hashnamesmap.get(11).get(2).length() +
                " First Char : " + hashnamesmap.get(11).get(2).charAt(0));


        // Don't do this
        System.out.println();
        System.out.println("Key 11 reassigned to propel ");
        hashnamesmap.put(11, propel);
        System.out.println("List reassigned " + "propel Students thru HashMap: " + hashnamesmap.get(11));

    }
}


