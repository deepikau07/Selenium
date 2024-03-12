package JavaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\deepi\\OneDrive\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
