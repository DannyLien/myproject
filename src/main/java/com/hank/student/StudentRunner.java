package com.hank.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Student.pass = 50;
        Student stu = new Student(//        userInput();
                "Hank", 51, 49);
        Student stu2 = new Student("Ecir", 55, 54);
        Student stu3 = new Student("Jann", 40, 41);
        GraduateStudent gstu = new GraduateStudent("Jack",55,66,60);
        gstu.print();
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score : " + stu.heighest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name:");
        String name = scanner.next();
        System.out.println("Please enter english:");
        int english = scanner.nextInt();
        System.out.println("Please enter math:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score : " + stu.heighest());
    }
}
