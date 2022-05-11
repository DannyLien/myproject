package com.hank.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class DayOfYear {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter year(2022) : ");
            String yearString = br.readLine();
            year = (yearString.length() > 0) ? Integer.parseInt(yearString) : year;
            System.out.println(year);

            System.out.println("Please enter month(5) : ");
            String monthString = br.readLine();
            month = (monthString.length() > 0) ? Integer.parseInt(monthString) : month;
            System.out.println(month);

            System.out.println("Please enter day(11) : ");
            String dayString = br.readLine();
            day = (dayString.length() > 0) ? Integer.parseInt(dayString) : day;
            System.out.println(day);

            System.out.println("You Enter Date : " + year + "/" + month + "/" + day);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
