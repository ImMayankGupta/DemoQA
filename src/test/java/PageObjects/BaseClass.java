package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	public HomePage hp;
	public BookPage bp;
	public LoginPage lp;
	
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");  	
		driver=new ChromeDriver(); 
		
		hp = new HomePage(driver);
		bp = new BookPage(driver);
		lp = new LoginPage(driver);
		
	}
	
	public void openURL() {
		driver.get("https://demoqa.com/");
	}
	
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
