package com.sankir;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringOfLinesMain {
    public static void main(String[] args) {
        String[] lines = {"Suzuki 30-06-2017 600000.17 AUtomatic",
                "Fiat 15-03-2018 575000.27 Manual",
                "Tata 25-09-2019 870000.17 AMT",
                "Toyota 27-02-2017 1060000.17 Automatic",
                "Hyundai 30-07-2018 1650000.17 Manual",
                "Kia 02-02-2019 1275000.17 AMT",
                "Ford 24-02-2020 900000.17 Manual",
                "Mahindra 16-03-2020 1360000.17 AMT",
                "Honda 17-04-2019 600000.17 Automatic",
                "Volkswagen 09-08-2018 600000.17 CVT",
        };

        String[] words = new String[1];

        LocalDate startref = LocalDate.of(2017, 01, 15);
        LocalDate endref = LocalDate.of(2019, 06, 15);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("The vehicles with vom between " + startref + " and " + endref + "are :");
        System.out.println();

        for (String str : lines) {
            words = str.split(" ");

            if ((LocalDate.parse(words[1], dtf)).compareTo(startref) > 0 && (LocalDate.parse(words[1], dtf)).compareTo(endref) < 0) {
                System.out.println(str);
            }
        }


    }
}
