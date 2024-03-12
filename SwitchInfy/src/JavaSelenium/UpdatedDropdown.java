package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		int i=1;
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='1 Pax']")).click();
		Thread.sleep(2000);
	while(i<5)
	{
			driver.findElement(By.xpath("//label[contains(@class,'pax-dropdown__label pax-dropdown__label--adult')]//button[2]")).click();
			i++;
	}		
		driver.findElement(By.className("custom-button__label")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='From']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'isActiveFromCity')]//div[2]//div[34]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'destination-row')])[673]")).click();
		
		
		//Thread.sleep(2000);
		//driver.findElement(By.id("Adult-testID-plus-one-cta']")).click();	
		//driver.findElement(By.id("home-page-travellers-done-cta")).click();
		

	}

}
