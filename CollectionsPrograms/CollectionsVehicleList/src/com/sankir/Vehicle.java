package com.sankir;

import java.time.LocalDate;

public class Vehicle extends Date{

    private String model;
    private LocalDate yom;
    private double price;
    private String transmission;
    private double capacity;

    public Vehicle() {
    }

    public Vehicle(String model, LocalDate yom, double price, String transmission, double capacity) {
        this.model = model;
        this.yom = yom;
        this.price = price;
        this.transmission = transmission;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYom() {
        return yom;
    }

    public void setYom(LocalDate yom) {
        this.yom = yom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", yom=" + yom +
                ", price=" + price +
                ", transmission='" + transmission + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
