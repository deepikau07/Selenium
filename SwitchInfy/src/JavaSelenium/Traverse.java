package JavaSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Traverse{

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\deepi\\OneDrive\\Documents\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText());
	}

}
