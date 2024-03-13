package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.louchBroswer;

public class pageText extends louchBroswer {

	public pageText() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[text()=\"×\"]")

	private WebElement crossIcon;
	
	@FindBy(xpath = "//a[text()=\"Practice\"]")

	private WebElement practice;
	
	//a[text()="Practice"]

	public void getVerifyText() {
		
		crossIcon.click();
		practice.click();
		
		System.out.println("my name is pushpendra kumar gaur");
		
		System.out.println("my name is ankit");
		
		System.out.println("rahul");
		
		System.out.println("Ma");
		
		System.out.println("Bhole");
		
		
		
		
		
	}

}
