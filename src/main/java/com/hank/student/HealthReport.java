package com.hank.student;

public class HealthReport implements Report{
    @Override
    public void load() {
        System.out.println("HealthReport.load()");
    }

    @Override
    public void print() {
        System.out.println("HealthReport.print()");
    }
}
