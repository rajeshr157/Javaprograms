package com.sankir;

public class Mtech extends Btech {

    static int mtechcount = 0;
    public int timer = 25;

    private int rank;
    private String specialization;

    public Mtech() {
        mtechcount++;
    }

    public Mtech(int rollno, int marks, String name, int rank, String specialization) {
        super(rollno, marks, name);
        this.rank = rank;
        this.specialization = specialization;
        mtechcount++;
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
        return "Mtech{" + "rollno=" + getRollno() +
                ", marks=" + getMarks() +
                ", name='" + getName() + '\'' +
                "rank=" + rank +
                ", specialization=" + specialization +
                '}';
    }

    public String display(String s) {

        return s.toUpperCase();
    }

    public int supertimer() {
        return super.timer;
    }
}
