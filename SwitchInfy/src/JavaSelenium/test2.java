package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
        driver.findElement(By.name("name")).sendKeys("Kaustubh Thakare");
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Password");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropDown = new Select(staticDropdown);
        dropDown.selectByVisibleText("Male");
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.name("bday")).sendKeys("12-12-2012");
        driver.findElement(By.xpath("//input[contains(@class,'btn-success')]")).click();
        System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
        driver.quit();

	}

}
