package JavaSelenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class usingStream {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veg= driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> filteredVeg = veg.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(veg.size(), filteredVeg.size());
		
	}

}
