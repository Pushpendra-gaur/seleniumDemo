package Test_class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.louchBroswer;
import pageClass.ClickOfButton;

public class clickTest extends louchBroswer{

	
	ClickOfButton ob;

	@BeforeTest
	
	public void broswer() {

		setUp();

		ob = new ClickOfButton();

	}
	
	@Test(priority = 1)
	public void getClick1() 
	{
		
		
		ob.getClick();
	}
	
	@Test(priority = 2)
	public void clickMe()
	{
		
		ob.performClickMe();
	}
	@Test(priority = 3)
	public void grtVerifyClick() {
		
		
		ob.verifyclick();
	}
}
