package com.sankir;

import java.time.LocalDate;

public class Vehicle extends Date {

    private int regno;
    private String model;
    private LocalDate dom;
    private double price;
    private String transmission;
    private double capacity;

    public Vehicle() {
    }

    public Vehicle(int regno, String model, LocalDate dom, double price, String transmission, double capacity) {
        this.regno = regno;
        this.model = model;
        this.dom = dom;
        this.price = price;
        this.transmission = transmission;
        this.capacity = capacity;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDom() {
        return dom;
    }

    public void setDom(LocalDate dom) {
        this.dom = dom;
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
                "regno=" + regno +
                ", model='" + model + '\'' +
                ", dom=" + dom +
                ", price=" + price +
                ", transmission='" + transmission + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
