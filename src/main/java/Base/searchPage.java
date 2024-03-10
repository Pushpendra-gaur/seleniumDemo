package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchPage {

	static String path = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe";

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElement(By.xpath("//input[@name=\"q\" and  @class=\"gsc-input\"]"));
		
		WebElement search = driver.findElement(By.xpath("//input[@class=\"gsc-search-button\"]"));
		
		ele.sendKeys("google");
		
		search.click();
		
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}	
	
}
