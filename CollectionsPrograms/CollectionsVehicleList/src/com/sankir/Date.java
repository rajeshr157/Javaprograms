package com.sankir;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

    public LocalDate manufactdate (String yom){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dom = LocalDate.parse(yom,dtf);

        return dom;
    }
}
