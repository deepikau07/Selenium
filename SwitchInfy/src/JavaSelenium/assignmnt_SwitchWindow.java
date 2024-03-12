package JavaSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignmnt_SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();

		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

		driver.switchTo().window(parentWindow);

		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}
