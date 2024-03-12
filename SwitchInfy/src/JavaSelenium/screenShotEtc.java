package JavaSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

public class screenShotEtc {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.manage().deleteAllCookies();
		 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\deepi\\OneDrive\\Desktop\\screenshot1.png"));

	}

}
