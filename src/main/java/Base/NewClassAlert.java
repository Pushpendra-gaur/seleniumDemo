package Base;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClassAlert {

	static String path = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement alert = driver.findElement(By.id("alert1"));

		alert.click();

		String actulaText = driver.switchTo().alert().getText();

		String Expetedtext = "Hello";
		
		System.out.println(actulaText);

		assertEquals(actulaText, Expetedtext);

		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss(); dismiss alert
	// 	driver.switchTo().alert().sendKeys("massage");  Send message then accept
		//driver.switchTo().alert().accept();

	}
}
