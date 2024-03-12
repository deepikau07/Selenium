package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertPractice {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//ALERT ACCEPT
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("xyz");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		

	}

}
