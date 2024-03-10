package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {

	static String path = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe";

	@Test
	public void fileUplod1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.testingbaba.com/old/");
		
	

		driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();

	}

}
