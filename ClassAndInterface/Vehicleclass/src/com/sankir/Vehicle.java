package com.sankir;

public class Vehicle {

    public int count = 0;

    private String model;
    private int yom;
    private double price;

    public Vehicle() {
        count++;
    }

    public Vehicle(String model, int yom, double price) {
        this.model = model;
        this.yom = yom;
        this.price = price;
        count++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYom() {
        return yom;
    }

    public void setYom(int yom) {
        this.yom = yom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", yom=" + yom +
                ", price=" + price +
                '}';
    }
}
