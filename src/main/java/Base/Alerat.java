package Base;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Alerat extends louchBroswer {

	WebElement ele = driver.findElement(By.xpath("//input[@id=\"alert1\"]"));

	@BeforeTest

	public void driver() {

		setUp();
	}

	@Test
	public void verifyAleart() {

		ele.click();
		String actualText = driver.switchTo().alert().getText();
		System.out.println(actualText);

		String expectedText = "Hellow";

		assertEquals(actualText, expectedText);
	}

}
