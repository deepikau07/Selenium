package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.id("checkBoxOption1")).click();
		//driver.findElement(By.id("checkBoxOption1")).click();
		//Thread.sleep(3000);
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Deepika");
		driver.findElement(By.name("email")).sendKeys("deepika@yopmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticDropdown= driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Female");
		
		
		//driver.findElement(By.xpath("(//option[normalize-space()='Female'])[1]")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("input[type='date']")).sendKeys("18/08/2023");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
		
	}

}
