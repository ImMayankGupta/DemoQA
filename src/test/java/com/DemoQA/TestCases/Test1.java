package test.java.com.DemoQA.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import test.java.com.DemoQA.PageObjects.BaseClass;

public class Test1 extends BaseClass{
	
	@BeforeClass
	public void openBrowser() {
		setup();
	}
	
	@Test
	public void test1(){
		openURL();
	}
	
	@Test
	public void test2() throws InterruptedException {
		hp.clickOnBookCard();
	}
	
	@Test
	public void test3() throws InterruptedException {
		bp.clickOnLoginButton();
	}
	
	@Test
	public void test4() throws InterruptedException {
		lp.performLogin();
	}
	
	@AfterClass
	public void close() {	
		closeBrowser();

	}
}
