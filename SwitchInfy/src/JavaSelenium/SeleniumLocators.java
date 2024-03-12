package JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("gywudge123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.className("p.error")).getText());
		

	}

}
