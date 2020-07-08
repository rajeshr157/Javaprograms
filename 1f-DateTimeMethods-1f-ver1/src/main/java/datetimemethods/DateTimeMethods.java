// Copyright @ SanKir Technologies, 2018 - Java Programming - Basic Datatypes
package datetimemethods;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeMethods {

  public static void main(String args[]) {
    System.out.println("Usage of LocalDate Class\n");

    // current version of date and time LocalDate and LocalDateTime
    System.out.println("Birthday date is ");
    LocalDate birthday = LocalDate.of(1972, 6, 12); // YYYY, MM, DD

    System.out.println("Default format for Date :" + birthday);
    System.out.println("Date in string format :" + birthday.toString());
    System.out.println("Year : " + birthday.getYear());
    System.out.println("Month : " + birthday.getMonth());
    System.out.println("Day of the month : " + birthday.getDayOfMonth());
    //System.out.println("Hour, Minute, Seconds"); No hour minute sec methods
    System.out.println("Day of the week : " + birthday.getDayOfWeek());
    System.out.println("Day of the year : " + birthday.getDayOfYear());

    // get the usage of isAfter and isBefore
    LocalDate checkdate = LocalDate.of(2000, 1, 1); // YYYY, MM, DD

    System.out.println();
    if (birthday.isAfter(checkdate))
      System.out.println("The person is milleanial ");
    else
      System.out.println("The person is Gen X");

    System.out.println();
    if (birthday.isBefore(checkdate))
      System.out.println("The person is Gen X");
    else
      System.out.println("The person is milleanial ");


    /// usage of Period utility - between
      System.out.println();
    System.out.println("Period Utiltiy");
    System.out.println("Today date is ");
    LocalDate today = LocalDate.now();
    System.out.println("Today's date is : " + today);

    Period p = Period.between(birthday, today);

    System.out.println("Age Diff in Y,M,D is: " + p.getYears() + ", " + p.getMonths() + ", " + p.getDays());

//        System.out.println();
//        System.out.println("LocalDateTime");
//        LocalDateTime datentime = LocalDateTime.now();
//        System.out.println(datentime);
//        System.out.println(datentime.toString());
//        System.out.println("Year : " + datentime.getYear());
//        System.out.println("Month : " + datentime.getMonth());
//        System.out.println("Day of the month : " + datentime.getDayOfMonth());
//        System.out.println("Hour, Minute, Seconds");
//        System.out.println(datentime.getHour() + ", " + datentime.getMinute() + ", " + datentime.getSecond());
//        System.out.println("Day of the week : " + datentime.getDayOfWeek());
//        System.out.println("Day of the year : " + datentime.getDayOfYear());
//
//        Month m = datentime.getMonth();
//        System.out.println("Month value thru another method : " + m.getValue());

    // previous version of data and time
      System.out.println();
    System.out.println("different date format");

    String date1 = "15-01-2012";

    String date2 = "02-25-2013";

      DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      LocalDate locdate1 = LocalDate.parse(date1, dtf1);

      DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
      LocalDate locdate2 = LocalDate.parse(date2, dtf2);

    // Print the dates
      System.out.println(locdate1);
      System.out.println(locdate2);

    // Compare the dates using compareTo()
    if (locdate1.compareTo(locdate2) > 0) {
      // When Date d1 > Date d2
      System.out.println("Date1 is after Date2");
    } else if (locdate1.compareTo(locdate2) < 0) {
      // When Date d1 < Date d2
      System.out.println("Date1 is before Date2");
    } else if (locdate1.compareTo(locdate2) == 0) {
      // When Date d1 = Date d2
      System.out.println("Date1 is equal to Date2");
    }
  }


}