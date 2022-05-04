package com.hank.student;

public class FinaceReport implements Report{
    @Override
    public void load() {
        System.out.println("FinceReport.load()");
    }

    @Override
    public void print() {
        System.out.println("FinceReport.print()");
    }
}
