package enumex;

// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

// The enum constants have initial  value that starts from 0, 1, 2, 3 and so on.
// But we can initialize the specific  value to the enum constants by defining fields and constructors.
//  Enum can have fields, constructors and methods.

// instance of enum cannot be crated by keyword 'new' because it contains private constructors only.

//Java enums extend the java.lang.Enum class implicitly, so your enum types cannot extend another class.

public class EnumEx {

    public static void main(String[] args) {

       Month mymonth = Month.APR;  // enum variable assigned one of the CONSTANTS
        //Month mymonth = Month.valueOf("JUNE");
        System.out.println(mymonth);
        System.out.println("enum CONSTANT through method - name: " + mymonth.name());  // name methods

//        int i = Month.JUNE.ordinal();
//        System.out.println(" value of i " + i);
        int i = mymonth.ordinal();
        System.out.println(" value of i " + i);


        String str = mymonth.toString(); // convert CONSTANT to String object
        System.out.println("mymonth in string format: " + str + " and its length : " + str.length());

        System.out.println();
        Month favmonth = Month.valueOf("OCT"); // // enum variable assigned one of the CONSTANTS thorugh valueOf method
        System.out.println("Favmonth through valueOf method: " + favmonth);

        System.out.println();
        Month[] myarr = Month.values(); // values method of enum returns array of enum CONSTANTS.

        System.out.println("Use enhanced loop to print CONSTANTS of enum Month loaded into enum array");
        //for (Month m : Month.values()) or
        for (Month m : myarr) {
            System.out.println(m);
        }

    }

}

// can be defined inside class but outside main

// enum is type of class with constants
enum Month {
    JAN,
    FEB,
    MAR,
    APR,
    MAY,
    JUNE,
    JULY,
    AUG,
    SEP,
    OCT,
    NOV,
    DEC
}


