package com.sankir;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\vehiclesin.txt";

        FileRd fr = new FileRd();
        String filecontents = fr.readFile(filepath);

        System.out.println(filecontents);

        String[] lines = filecontents.split("\n");
        System.out.println(lines);

        ArrayList<String> lineslist = new ArrayList<>();
        lineslist.addAll(Arrays.asList(lines));

        ArrayList<Vehicle> vehiclerecords = new ArrayList<>();

         Date dt = new Date();

        for (String line : lineslist) {
            String[] values = line.split(",");
            Vehicle vobj = new Vehicle(Integer.parseInt(values[0]), values[1], Vehicle.getDate(values[2]), Double.parseDouble(values[3]), values[4], Double.parseDouble(values[5]));
            vehiclerecords.add(vobj);
        }

        vehiclerecords.forEach(record -> {
            System.out.println(record);
        });

        System.out.println("Array list size: " + vehiclerecords.size());

        System.out.println("Max Price: " + Collections.max(vehiclerecords, Comparator.comparingDouble(Vehicle::getPrice)));


    }
}
