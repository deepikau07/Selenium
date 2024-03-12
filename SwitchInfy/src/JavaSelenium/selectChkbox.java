package JavaSelenium;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selectChkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Assert
	//	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
	
		
		//True-False for chkbox selected
		//System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		//driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		
		//Choose locations
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		driver.findElement(By.cssSelector(".dropdownDiv a[value='GWL']")).click();
		Thread.sleep(2000);
		//Choose Calendar
		driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-today .ui-state-default.ui-state-highlight")).click();
		
		//checkbox count
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//auto-suggestive dropdown
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("Fr");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement suggest :suggestions)
		{
			if(suggest.getTagName().equalsIgnoreCase("France"))
			{
				suggest.click();
				break;
			}
			
			//Static dropdown
			driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
			Thread.sleep(3000);
			int i;
			for(i=1;i<5;i++)
			{
			driver.findElement(By.id("hrefIncAdt")).click();
			}
		}
			
		
		

	}

}
