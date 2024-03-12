package JavaSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();  //parent -child - subchild ID
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		String email =driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(email);
	}

}
