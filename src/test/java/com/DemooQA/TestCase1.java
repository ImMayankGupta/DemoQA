package com.DemooQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.BaseClass;

public class TestCase1 extends BaseClass{
	
	//Page object model
	
	//Method calling and method definition
	// Parent class and child class
	// constructor
	
	@BeforeClass
	public void set() {
		setup();
	}
		
	@Test
	public void test1() throws InterruptedException {
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
	public void closebrowser() throws InterruptedException {
		closeBrowser();
	}

}
