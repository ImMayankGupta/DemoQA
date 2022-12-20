package test.java.com.DemoQA.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	
	public HomePage hp;
	public BookPage bp;
	public LoginPage lp;
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");  
		driver = new ChromeDriver();
		//hp = PageFactory.initElements(driver, HomePage.class);
		hp = new HomePage(driver);
		bp = new BookPage(driver);
		lp= new LoginPage(driver);
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void openURL() {
		driver.get("https://demoqa.com/");
	}
	
	
	

}
