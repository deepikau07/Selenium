package JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\deepi\\OneDrive\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("wert123");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("deeps");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("deeps@gmail.com");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		//driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("deeps.co.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0000000000");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		//driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		driver.findElement(By.className("signInBtn")).click();
		

	}

}
