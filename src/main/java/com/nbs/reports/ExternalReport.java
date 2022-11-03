package com.nbs.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.nbs.contants.FrameworkConstants;

public final class ExternalReport {

    private ExternalReport(){}

    public static ExtentReports extent;
    public static ExtentTest loginTest;


    public static void initReport(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getReportPath());
        extent.attachReporter(spark);
    }


    public static void flushReport(){
        extent.flush();
    }

    public static void createTest(String testCaseName){

        loginTest = extent.createTest(testCaseName);
    }
}
