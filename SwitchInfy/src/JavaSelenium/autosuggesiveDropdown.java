package JavaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosuggesiveDropdown {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(5000);
		
		List<WebElement> Options = driver.findElements(By.cssSelector("Ii[class='ui-menu-item'] a"));
		Thread.sleep(3000);
		for (WebElement option :Options)
		{
			if(option.getText().equalsIgnoreCase("India"));
			{
			option.click();
			break;
			}
		}
		
		
	}

}
