package com.sankir;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeMethods {
    public static void main(String[] args) {

        System.out.println("Rajesh's B'day is : ");
        LocalDate birthday = LocalDate.of(1992, 11, 19);

        System.out.println("In Default format : " + birthday);
        System.out.println("In string format: " + birthday.toString());
        System.out.println();

        System.out.println("Year: " + birthday.getYear());
        System.out.println("Era: " + birthday.getEra());
        System.out.println("Month: " + "(" + birthday.getMonth() + ")" + birthday.getMonthValue());
        System.out.println("Day of month: " + birthday.getDayOfMonth());
        System.out.println("Day of week: " + birthday.getDayOfWeek());
        System.out.println("Day of year: " + birthday.getDayOfYear());

        LocalDate refdate = LocalDate.of(2000, 01, 01);
        System.out.println();
        System.out.println("Check date is: " + refdate);

        System.out.println();

        if (birthday.isAfter(refdate))
            System.out.println("Born after Reference Date");

        if (birthday.isBefore(refdate))
            System.out.println("Born before reference date");

        System.out.println();

        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

        Period age = Period.between(birthday, today);
        System.out.println("The age as of today is: " + age);

        System.out.println("Age in fully expanded form is: " + age.getYears() + " Yrs, " + age.getMonths() + " Months, " + age.getDays() + " Days.");

        System.out.println();
        System.out.println("Different date format");

        String date1 = "15-01-2012";

        String date2 = "02-25-1992";

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate ld1 = LocalDate.parse(date1, dtf1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate ld2 = LocalDate.parse(date2, dtf2);

        System.out.println("Local date 1: " + ld1);
        System.out.println("Local date 2: " + ld2);

        if (ld1.compareTo(ld2) > 0)
            System.out.println("Date 1 is after Date 2");
        if (ld1.compareTo(ld2) < 0)
            System.out.println("Date 1 is before Date 2");
        if (ld1.compareTo(ld2) == 0)
            System.out.println("Date 1 and Date 2 are the same");
        if (ld1.compareTo(birthday)>0)
            System.out.println("Date 1 is after Rajesh's B'Day.");
        if (ld1.compareTo(birthday)<0)
            System.out.println("Date 1 is before Rajesh's B'day.");
        if (ld2.compareTo(birthday)>0)
            System.out.println("Date 2 is after Rajesh's B'day.");
        if (ld2.compareTo(birthday)<0)
            System.out.println("Date 2 is before Rajesh's B'day.");
    }
}

