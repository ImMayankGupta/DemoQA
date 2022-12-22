package test.java.com.DemoQA.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends BaseClass{
	
	public BookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id="login")
	public WebElement login;
	
	
	public void clickOnLoginButton() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		//login.click();
		Thread.sleep(3000);
	}

}
