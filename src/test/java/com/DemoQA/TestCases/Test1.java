package test.java.com.DemoQA.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.java.com.DemoQA.PageObjects.BaseClass;

public class Test1 extends BaseClass{
	
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public void openBrowser() {
		report = new ExtentReports("Report/"+"TestReport.html");
		test = report.startTest("Demo---QA");
		setup();
	}
	
	@Test
	public void test1(){
		test.log(LogStatus.INFO,"Test 1 execution start");
		try{
			openURL();
			test.log(LogStatus.PASS,"Test 1 Passed");
		}
		catch(Exception e) {
			test.log(LogStatus.FAIL,"Test 1 Failed");
		}
		test.log(LogStatus.INFO,"Test 1 execution end");
	}
	
	@Test
	public void test2() throws InterruptedException {
		test.log(LogStatus.INFO,"Test 2 execution start");
		try {
			hp.clickOnBookCard();
			test.log(LogStatus.PASS,"Test 2 Passed");
		}
		catch(Exception e) {
			test.log(LogStatus.FAIL,"Test 2 Failed");
		}
		test.log(LogStatus.INFO,"Test 2 execution end");
	}
	
	@Test
	public void test3() throws InterruptedException {
		test.log(LogStatus.INFO,"Test 3 execution start");
		try {
			bp.clickOnLoginButton();
			test.log(LogStatus.PASS,"Test 3 Passed");
		}
		catch(Exception e) {
			test.log(LogStatus.FAIL,"Test 3 Failed");
		}
		test.log(LogStatus.INFO,"Test 3 execution end");
	}
	
	@Test
	public void test4() throws InterruptedException {
		test.log(LogStatus.INFO,"Test 4 execution start");
		try {
			lp.performLogin();
			test.log(LogStatus.PASS,"Test 4 Passed");
		}
		catch(Exception e) {
			test.log(LogStatus.FAIL,"Test 4 Failed");
		}
		test.log(LogStatus.INFO,"Test 4 execution end");
	}
	
	@AfterClass
	public void close() {	
		closeBrowser();
		report.endTest(test);
		report.flush();
	}
}
