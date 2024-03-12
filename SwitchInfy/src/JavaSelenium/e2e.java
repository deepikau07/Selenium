package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class e2e {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//LOCATION
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		driver.findElement(By.cssSelector(".dropdownDiv a[value='MAA']")).click();
		Thread.sleep(2000);
		//CALENDAR
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if(driver.findElement(By.id("spclearDate")).getAttribute("style").contains("block"))
		{
			System.out.println("It is not Enabled");
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
		//PASSENGERS
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		Thread.sleep(2000);
		int i;
		for(i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		//SUBMIT
		driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	