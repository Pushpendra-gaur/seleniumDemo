package pageClass;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.louchBroswer;

public class pageTitle extends louchBroswer {

	public pageTitle() {

		PageFactory.initElements(driver, this);

	}

	
	public void getVerifyTitle() {

		String ActualTitle = "Testing Baba";
		
		String ExpectedTitle = driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}

}
