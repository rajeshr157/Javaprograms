package oopsinheritance.com;

/**
 *
 */
// Mtech has access to all the mebers of Btech class
public class MTech extends BTech{

    static int mTechobjCount =0;
    public int timer =25;

    private int rank;
    private String specialization;


    // executes BTech() by default


    public MTech() {
        mTechobjCount++;
    }

    public MTech(int rollno, String name, int marks, int rank, String specialization) {
        super(rollno, name, marks);
        this.rank = rank;
        this.specialization = specialization;
        mTechobjCount++;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    @Override
    public String toString() {
        return "MTech{" +
            "rollno=" + getRollno() +
            ", name='" + getName() + '\'' +
            ", marks=" + getMarks() +
            ", rank=" + rank +
            ", specialization='" + specialization + '\'' +
            '}';
    }

    @Override
    public String display(String s) {

        return s.toUpperCase();  //return uppercase
    }

    public int supertimer(){

        return super.timer;
    }

    }


