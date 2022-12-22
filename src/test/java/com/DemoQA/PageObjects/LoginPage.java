package test.java.com.DemoQA.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass{
	
	public LoginPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	@FindBy(id="userName")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	public void performLogin() throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		
		//userName.sendKeys("gunjankaushik");
		//password.sendKeys("Password@123");
		
		Thread.sleep(3000);
		
		//bp.login.click();
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
	}

}
