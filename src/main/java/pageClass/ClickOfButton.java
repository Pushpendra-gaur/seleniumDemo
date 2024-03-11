package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.louchBroswer;

import org.openqa.selenium.interactions.Actions;

public class ClickOfButton extends louchBroswer {

	public ClickOfButton() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[text()=\"×\"]")
	private WebElement crossIcon;

	@FindBy(xpath = "//div[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement practice;

	@FindBy(xpath = "//button[@data-target=\"#elements\"]")
	private WebElement elements;

	@FindBy(xpath = "//div[@id=\"v-pills-tab\"]/a[5]")
	private WebElement buttons;

	@FindBy(xpath = "//button[@type=\"button\" and @onclick=\"clicktext()\"]")
	private WebElement clickMe;
	
	@FindBy(xpath = "//p[@id=\"click-content\"]")
	private WebElement verifyclickText;
	

	// *[@id="tab_5"]/div[3]/button/text()
	// button[@data-target="#elements"]
	// a[text()="Practice"]
	// button[text()="×"]

	public void getClick() {

		crossIcon.click();
		practice.click();
		elements.click();
		
		Actions ac = new Actions(driver);
		ac.moveToElement(buttons).click();
		

	}

	public void performClickMe() {

		Actions act = new Actions(driver);

		act.contextClick(clickMe);

	}
	
	public void verifyclick() {
		
		String ActualText = verifyclickText.getText();
		
		System.out.println(ActualText);
		
		
		String ExpectedText = "you have done a dynamic click";
		
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("my name is pushpendra");
		
		System.out.println("my name is ankit");
		
		System.out.println("my name is ankit");
		System.out.println("my name is ankit");
	}

}
