package testautomation.listener;

import io.restassured.RestAssured;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

@Listeners
public class TestListener implements ITestListener {
    private static final Logger log = LogManager.getLogger(TestListener.class);

    public void onStart(ISuite iSuite) {
        log.info("Starting test suit");
    }

    public void onFinish(ISuite iSuite) {
        log.info("Finished running all the tests.");
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        log.info("Starting test " + iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        log.info("Test " + iTestResult.getName() + " PASSED");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        log.error("Test " + iTestResult.getName() + "  FAILED");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        log.warn("Test " + iTestResult.getName() + " SKIPPED");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}