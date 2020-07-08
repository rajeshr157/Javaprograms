package com.sankir;

import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class VehiclesMain {

    public static void main(String[] args) {

        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\vehiclesin.txt";

        FileRead fr = new FileRead();

        String filecontent = fr.readFromFile(filepath);

        String[] lines = filecontent.split("\n");

        ArrayList<String> readlines = new ArrayList<>();
        readlines.addAll(Arrays.asList(lines));

        System.out.println("Array list elements: ");
        readlines.forEach(i -> System.out.println(i));

        ArrayList<Vehicle> vehiclerecords = new ArrayList<>();

        Vehicle vobj = new Vehicle();

        Date dt = new Date();

        for (String line : readlines) {
            String[] values = line.split(",");
            vobj = new Vehicle(values[0], dt.manufactdate(values[1]), Double.parseDouble(values[2]), values[3], Double.parseDouble(values[4]));
            vehiclerecords.add(vobj);
        }

        System.out.println();
        System.out.println("The size of Arraylist in which Vehicle objects are stored is: " + vehiclerecords.size());

        Vehicle entries;

        System.out.println("The vehicle with max. price is: " + Collections.max(vehiclerecords, Comparator.comparingDouble(Vehicle::getPrice)));

        System.out.println();

        System.out.println("The vehicle with least price is: " + Collections.min(vehiclerecords, Comparator.comparingDouble(Vehicle::getPrice)));

        System.out.println();

        System.out.println("The vehicle with largest engine capacity is : " + Collections.max(vehiclerecords, Comparator.comparingDouble(Vehicle::getCapacity)));
        System.out.println("The vehicle with smallest engine capacity is : " + Collections.min(vehiclerecords, Comparator.comparingDouble(Vehicle::getCapacity)));

        System.out.println();

        System.out.println("The vehicle with latest DOM: " + Collections.max(vehiclerecords, Comparator.comparing(Vehicle::getYom)));
        System.out.println("The vehicle with oldest DOM: " + Collections.min(vehiclerecords, Comparator.comparing(Vehicle::getYom)));

        System.out.println();

        LocalDate refdate1 = LocalDate.of(2018, 01, 01);
        LocalDate refdate2 = LocalDate.of(2019, 06, 30);

        System.out.println("The cars manufactured between the reference dates are: ");

        int count = 0;
        vehiclerecords.forEach(record -> {
            if ((record.getYom().compareTo(refdate1) >= 0) && (record.getYom().compareTo(refdate2) <= 0)) {
                System.out.println(record);

            }
        });

        System.out.println();
        System.out.println("All vehicles with AMT: ");

        vehiclerecords.forEach(record -> {
            if (record.getTransmission().equals("AMT"))
                System.out.println(record);
        });

        System.out.println();
        System.out.println("All vehicles with Manual Transmission: ");




        vehiclerecords.forEach(record -> {
            if (record.getTransmission().equals("Manual")) {
                System.out.println(record);

            }
        });

        double refprice = 10.0;

        System.out.println();

        vehiclerecords.forEach(record -> {
            if (record.getPrice() > refprice)
                System.out.println("Vehicle with price above " + refprice + " is: " + record);

        });

        System.out.println();

        vehiclerecords.forEach(record -> {
            if (record.getPrice() < refprice)
                System.out.println("Vehicle with price below " + refprice + " is: " + record);
        });

        filepath = "F:\\Sankir\\Javaprograms\\Datasets\\vehicleoutmanual.txt";
        String contents = "";

        FileWrite fw = new FileWrite();

        for (Vehicle record : vehiclerecords) {
            if (record.getTransmission().equals("Manual")) {
                contents += record.toString() + "\n";
            }

        }

        fw.writeToFile(filepath, contents);

    }
}