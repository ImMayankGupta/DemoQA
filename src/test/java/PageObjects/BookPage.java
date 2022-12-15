package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookPage extends BaseClass{
	
	BookPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickOnLoginButton() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
	}
	
	
	

}
