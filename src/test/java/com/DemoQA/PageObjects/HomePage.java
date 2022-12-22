package test.java.com.DemoQA.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{
	
	HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//h5[text()='Book Store Application']")
	WebElement store;
	
	public void clickOnBookCard() throws InterruptedException {	
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		driver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();
		
		//store.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(3000);
	}

}
