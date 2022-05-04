package com.hank.student;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report finace = new FinaceReport();
        Report health = new HealthReport();
        List<Report> reports = new ArrayList<>();
        reports.add(finace);
        reports.add(health);
        for (Report report :
                reports) {
            report.load();
            report.print();
        }
    }
}
