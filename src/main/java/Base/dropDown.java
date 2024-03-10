package Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	static String path = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement drpodownElement = driver.findElement(By.xpath("//select[@id=\"drop1\"]"));

		Select drop = new Select(drpodownElement);
		drop.selectByVisibleText("doc 2");

		System.out.println("dropdown is multiple "+"=" + " " + drop.isMultiple());

		List<WebElement> list = drop.getOptions();
		
		for( WebElement ele: list)
			
		{
			
			System.out.println(ele.getText());
			
		}

		

		Thread.sleep(2000);

		driver.quit();

	}

}
