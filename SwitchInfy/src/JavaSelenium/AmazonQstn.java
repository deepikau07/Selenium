package JavaSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonQstn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		int j = 0;
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		// declair array
		String[] productName = { "Cauliflower", "Beans", "Tomato" };
		Thread.sleep(3000);
		// list all prods
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			// trim -1kg using split method
			// Cucumber - 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// chk extracted Vegi name is present in arraylist or not
			// convert Array to arraylist in runtime

			List Veggies = Arrays.asList(productName);

			if (Veggies.contains(formattedName)) {
				j++;
				// add item to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == productName.length) {
					break;
				}
			}
		}

	}

}
