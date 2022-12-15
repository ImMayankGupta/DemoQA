package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass{
	
	HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickOnBookCard() throws InterruptedException {
		//to scroll the page
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();
		Thread.sleep(5000);
	}

}
