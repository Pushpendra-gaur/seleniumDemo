package Test_class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.louchBroswer;
import pageClass.pageText;

public class textTest extends louchBroswer {

	pageText ob;

	@BeforeTest
	public void lounchBroswer() {
		setUp();

		ob = new pageText();

	}
	
	@Test
	public void getText() {
		
		ob.getVerifyText();
	}

}
