package com.sankir;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainVehicle {
    public static void main(String[] args) {

        int count = 0;
        System.out.println("Vehicle Class Program.");
        System.out.println();

        Vehicle v1 = new Vehicle("WagonR", "30-06-2017", 600000.17);
        Vehicle v2 = new Vehicle("Swift", "01-01-2018", 850000.27);
        Vehicle v3 = new Vehicle("Ecosport", "01-06-2018", 1050000.37);
        Vehicle v4 = new Vehicle("Baleno", "01-08-2018", 675000.47);
        Vehicle v5 = new Vehicle("Nexon", "01-01-2019", 650000.57);
        Vehicle v6 = new Vehicle("Altroz", "31-03-2019", 650000.67);
        Vehicle v7 = new Vehicle("Jeep", "31-12-2019", 650000.77);
        Vehicle v8 = new Vehicle("Alto", "01-01-2020", 650000.87);
        Vehicle v9 = new Vehicle("Harrier", "01-02-2020", 650000.97);
        Vehicle v10 = new Vehicle("Innova", "01-03-2020", 650000.99);

        Vehicle[] vehicles = new Vehicle[]{v1, v2, v3, v4, v5, v6, v7, v8, v9, v10};

        System.out.println("List of all vehicles: ");
        for (Vehicle val : vehicles)
            System.out.println(val);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String checkdate1 = "01-01-2019";

        System.out.println();
        System.out.println("List of vehicles after 01-01-2019 are as follows: ");

        for (Vehicle val : vehicles) {

            LocalDate yomdate = LocalDate.parse(val.getYom(), dtf1);
            LocalDate refdate = LocalDate.parse(checkdate1, dtf1);

            if (yomdate.compareTo(refdate) > 0)
                System.out.println(val);
        }

        String checkdate2 = "01-06-2017";
        String checkdate3 = "01-06-2018";


        System.out.println();
        System.out.println("List of vehicles between 01-06-2017 & 01-06-2018 are as follows: ");

        for (Vehicle val : vehicles) {

            LocalDate yomdate = LocalDate.parse(val.getYom(), dtf1);
            LocalDate refdate1 = LocalDate.parse(checkdate2, dtf1);
            LocalDate refdate2 = LocalDate.parse(checkdate3, dtf1);

            if (yomdate.compareTo(refdate1) > 0 && yomdate.compareTo(refdate2) < 0)
                System.out.println(val);
        }

        System.out.println();
        System.out.println("List of vehicles manufactured on 01-06-2017 are as follows: ");

        for (Vehicle val : vehicles) {

            LocalDate yomdate = LocalDate.parse(val.getYom(), dtf1);
            LocalDate refdate1 = LocalDate.parse(checkdate2, dtf1);
            LocalDate refdate2 = LocalDate.parse(checkdate3, dtf1);

            if (yomdate.compareTo(refdate1) == 0)
                System.out.println(val);
        }

        System.out.println();
        System.out.println("List of vehicles manufactured on 01-06-2018 are as follows: ");

        for (Vehicle val : vehicles) {

            LocalDate yomdate = LocalDate.parse(val.getYom(), dtf1);
            LocalDate refdate1 = LocalDate.parse(checkdate2, dtf1);
            LocalDate refdate2 = LocalDate.parse(checkdate3, dtf1);

            if (yomdate.compareTo(refdate2) == 0)
                System.out.println(val);

        }

        System.out.println();
        System.out.println("List of vehicles manufactured on 01-01-2019 are as follows: ");

        for (Vehicle val : vehicles) {
            LocalDate yomdate = LocalDate.parse(val.getYom(), dtf1);
            LocalDate refdate = LocalDate.parse(checkdate1, dtf1);

            if (yomdate.compareTo(refdate) == 0)
                System.out.println(val);
        }

    }
}
