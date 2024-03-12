package JavaSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scopeDmo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();   
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size()); //total link
		
		WebElement subDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(subDriver.findElements(By.tagName("a")).size()); //link in footer section
		
		WebElement columnDriver = subDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); //links in the 1st column of footer
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER); // will open in another tab
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(5000);
		}
			Set<String> abc = driver.getWindowHandles(); //4 titles will vbe printed
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
		}

	}

