package Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;


public class louchBroswer {

	public static WebDriver driver;

	String path = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe";

	
	public void setUp() {
		// WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver", path);

		driver = new ChromeDriver();

		driver.get("https://www.testingbaba.com/old/");

		driver.manage().window().maximize();

	}

	
	public void getScreenShot(ITestResult result) throws IOException {

		if (ITestResult.FAILURE==result.getStatus()) {
			
			Reporter.log("Test case is fail because of below reason");

			TakesScreenshot screenshot = (TakesScreenshot) driver;

			File src = screenshot.getScreenshotAs(OutputType.FILE);

			File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Demo\\Screenshot\\fulpage.png");

			FileUtils.copyFile(src, dest);
			
		}else {
			
			Reporter.log("test case is pass");
		}
		

	}

}
