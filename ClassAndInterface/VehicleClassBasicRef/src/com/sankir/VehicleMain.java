package com.sankir;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VehicleMain {


  public static void main(String[] args) {

    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    String s1 = "Ritz,2017-01-01,5.5,Manual";
    String[] words = s1.split(",");

    String mod = words[0];
    LocalDate ym = LocalDate.parse(words[1], dtf1);
    double pr = Double.parseDouble(words[2]);
    String tr = words[3];

    Vehicle v1 = new Vehicle(mod, ym, pr, tr);
    System.out.println(v1);


    String s2 = "Honda,2018-06-01,15.75,Automatic";
    words = s2.split(",");

    Vehicle v2 = new Vehicle(words[0], LocalDate.parse(words[1], dtf1), Double.parseDouble(words[2]), words[3]);
    System.out.println(v2);


    System.out.println();
    String[] lines = {"Ritz,2017-01-01,5.5,Manual",
        "Honda,2018-06-01,15.75,Automatic",
        "Hyundai,2019-07-10,12.5,Manual",
        "Toyota,2017-05-12,17.0,Automatic",
        "Nissan,2018-07-12,19.5,Automatic"
    };

    Vehicle[] records = new Vehicle[lines.length];

    for (int i = 0; i < lines.length; i++) {
      words = lines[i].split(",");
      records[i] = new Vehicle(words[0], LocalDate.parse(words[1], dtf1), Double.parseDouble(words[2]), words[3]);
    }
    for (Vehicle v : records)
      System.out.println(v);


    System.out.println();
    for (Vehicle v : records) {
      if (v.getTransmission().equals("Automatic"))
        System.out.println(v);
    }
  }

}
