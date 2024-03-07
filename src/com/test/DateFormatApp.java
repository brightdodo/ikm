package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateFormatApp {
    public static void main(String[] args) throws ParseException {
        LocalDate localDate = LocalDate.of(2015,4,4);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        /*Date aDate = null;
        aDate = new SimpleDateFormat("yyyy-mm-dd").parse("2015-01-15");
        Calendar aCalendar = Calendar.getInstance();
        aCalendar.setTime(aDate);
        System.out.println(aCalendar.get(aCalendar.DAY_OF_MONTH) + "," + aCalendar.get(aCalendar.MONTH));
        DateTimeFormatter formatter =        DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate bDate = LocalDate.parse("2021-01-15", formatter);
        System.out.println(bDate.getDayOfMonth() + "," + bDate.getMonthValue());*/
    }
}
