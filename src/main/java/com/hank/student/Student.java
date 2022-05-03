package com.hank.student;

import jdk.dynalink.beans.StaticClass;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;

    public Student(int english, int math) {
        this.english = english;
        this.math = math;
    }

    public Student(String name, int english, int math) {
        this(english, math);
        this.name = name;
    }

    public int heighest() {
        return (english > math) ? english : math;
    }

    public void print() {
        System.out.print(name + "\t" + english + "\t" + math + "\t" +
                getAvgerage() + "\t" + ((getAvgerage() >= pass) ? "PASS" : "FAILED"));
        char grading = 'F';
        switch (getAvgerage() / 10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            case 5:
                grading = 'E';
                break;
            default:
                grading = 'F';
                break;
        }
        System.out.println("\t" + grading);

    }

    public int getAvgerage() {
        return (english + math) / 2;
    }


}
