package com.hank.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        //猜數字
        //猜4次
        int secret = new Random().nextInt(9) + 1;
        System.out.println("secret : " + secret);
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.println("Please enter a number (" + i + "/4) : ");
            number = scanner.nextInt();
            if (number < secret) {
                System.out.println("Higher");
            } else if (number > secret) {
                System.out.println("Lower");
            } else {
                System.out.println("Great, the Number is : " + number);
                break;
            }
        }
        System.out.println("GameFor End");
    }

}
