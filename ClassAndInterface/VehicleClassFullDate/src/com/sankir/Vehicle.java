package com.sankir;

public class Vehicle {

    static int count;

    private String model;
    private String yom;
    private double price;

    public Vehicle() {
        count++;
    }

    public Vehicle(String model, String yom, double price) {
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

    public String getYom() {
        return yom;
    }

    public void setYom(String yom) {
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
                ", yom='" + yom + '\'' +
                ", price=" + price +
                '}';
    }
}
