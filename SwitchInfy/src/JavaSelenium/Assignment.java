package JavaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("checkBoxOption1")).click();
	String selectedOption = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
	
	WebElement allOptions = driver.findElement(By.id("dropdown-class-example"));
	Select s=new Select(allOptions);
	s.selectByVisibleText(selectedOption);
	
	driver.findElement(By.name("enter-name")).sendKeys(selectedOption);
    driver.findElement(By.id("alertbtn")).click();
    String text=  driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
    
    if(text.contains(selectedOption))
    	
    {
    	
    	 System.out.println("Alert message success");
    }
    else
    	  System.out.println("Something wrong with execution");
    }
	
	
	
	}
