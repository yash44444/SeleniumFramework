package com.nbs.listeners;

import com.nbs.reports.ExtentLogger;
import com.nbs.reports.ExternalReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ExternalReport.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName()+" passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getName()+" failed");
    }

    @Override
    public void onStart(ITestContext context) {
        ExternalReport.initReport();
    }

    @Override
     public void onFinish(ITestContext context) {
        ExternalReport.flushReport();
    }

}
