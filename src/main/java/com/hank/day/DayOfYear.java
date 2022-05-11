package com.hank.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter year(2022) : ");
            String yearString = br.readLine();
            if (yearString.length() > 0) {
                year = Integer.parseInt(yearString);
            }
            System.out.println(year);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
