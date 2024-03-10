package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textAreaField {
	
  louchBroswer ob;

	static String path = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		WebElement txt = driver.findElement(By.xpath("//textarea[@id=\"ta1\"]"));
		
		txt.sendKeys("My name is pushpendra gaur");
		
		System.out.println("my text is "+""+txt.getText());
		
		Thread.sleep(2000);
		
		
}}
