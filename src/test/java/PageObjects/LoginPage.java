package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass{
	
	LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void performLogin() throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
	}

}
