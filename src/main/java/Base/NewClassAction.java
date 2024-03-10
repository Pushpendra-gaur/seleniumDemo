package Base;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClassAction {

	static String path = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@ondblclick='dblclickAlert()']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(ele).perform();
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		

	}

}
