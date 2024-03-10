package Test_class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.louchBroswer;
import pageClass.pageTitle;

public class Test_Title extends louchBroswer {

	pageTitle ob;

	@BeforeTest
	
	public void broswer() {

		setUp();

		ob = new pageTitle();

	}

	@Test(priority = 1)
	
	public void verifyTitle() {
		
		ob.getVerifyTitle();
	}
	
}
