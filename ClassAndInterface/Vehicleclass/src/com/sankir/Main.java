package com.sankir;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vehicle Class Program.");
        System.out.println();

        Vehicle v1 = new Vehicle("WagonR", 2017, 600000.17);
        Vehicle v2 = new Vehicle("Swift", 2018, 850000.27);
        Vehicle v3 = new Vehicle("Ecosport", 2018, 1050000.37);
        Vehicle v4 = new Vehicle("Baleno", 2018, 675000.47);
        Vehicle v5 = new Vehicle("Nexon", 2019, 650000.57);
        Vehicle v6 = new Vehicle("Altroz", 2019, 650000.67);
        Vehicle v7 = new Vehicle("Jeep", 2019, 650000.77);
        Vehicle v8 = new Vehicle("Alto", 2020, 650000.87);
        Vehicle v9 = new Vehicle("Harrier", 2020, 650000.97);
        Vehicle v10 = new Vehicle("Innova", 2020, 650000.99);

        Vehicle[] vehicles = new Vehicle[]{v1, v2, v3, v4, v5, v6, v7, v8, v9, v10};

        for (Vehicle val : vehicles)
            System.out.println(val);


        String checkdate = "01-01-2019";

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate refdate = LocalDate.parse(checkdate, dtf1);

        System.out.println();
        System.out.println("List of vehicles after 01-01-2019");

        for (Vehicle val : vehicles) {
            int valyom = val.getYom();
            int cutoffdate = refdate.getYear();

            if (valyom > cutoffdate)
                System.out.println(val);
        }

    }
}
