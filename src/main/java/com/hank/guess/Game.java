package com.hank.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(9) + 1;
        System.out.println("secret : " + secret);

        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while (number != secret) {
            System.out.println("Please enter a number : ");
            number = scanner.nextInt();
//            System.out.println(number);
            if (number < secret) {
                System.out.println("Higher");
            } else if (number > secret) {
                System.out.println("Lower");
            } else {
                System.out.println("Great, the Number is : " + number);
            }
        }

    }
}
