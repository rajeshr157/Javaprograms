package filerwintohashset;

import java.util.Objects;

// Student class and its members - attributes, constructor, getter&setter
public class Student {
    // properties or attributes
    private int rollno;
    private String name;
    private int age;

    // No-arg or default constructor
    public Student() {
    }

    // initialised constructor
    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    // getter & Setter
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Rollno: " + this.rollno + "; Name: " + this.name + "; Age: " + this.age;
    }

    // to add objects into HashSet, following methods of paretn Object class
    // need to be overwritten

    // hashcode
    // equals

    //overie these methods to indicate the criteria to remove dupilcate objects
    @Override
    public int hashCode( ) {
        //return Objects.hash(getName());  // to remove duplicate names irrespective of same age or not
        return Objects.hash(getAge());  // to remove duplicate ages irrespective of same name or not

    }

    @Override
    public boolean equals(Object o) {
        /*if (this == o)
            return true;
        if (!(o instanceof Student))
            return false;*/
        Student st = (Student) o;

       //return getName().equals(st.getName());
       //return (getAge()==(st.getAge()));

        return ( (getName().equals(st.getName())) && (getAge()==(st.getAge())) );
        //return ( (getName().equals(st.getName())) && (getRollno()==(st.getRollno())) );

        //return ( (getRollno()==(st.getRollno())) && (getName().equals(st.getName())) && (getAge()==(st.getAge())) );

    }


} // Class Student Ends


/* Reference code

 public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }

 */