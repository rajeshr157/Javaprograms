package com.sankir;

import java.time.LocalDate;

public class Vehicle {

  private String model;
  private LocalDate yom;
  private double price;
  private String transmission;

  public Vehicle() {
  }

  public Vehicle(String model, LocalDate yom, double price, String transmission) {
    this.model = model;
    this.yom = yom;
    this.price = price;
    this.transmission = transmission;
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

  @Override
  public String toString() {
    return "Vehicle{" +
        "model='" + model + '\'' +
        ", yom=" + yom +
        ", price=" + price +
        ", transmission='" + transmission + '\'' +
        '}';
  }
}
