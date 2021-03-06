package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageBase {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[text()='WebDriver - Selenium.dev']")
	public WebElement FirstLink;
	
	
	
	
	// get the first link and click on it 
	
	public void ClickOnFirstLink()
	{
		FirstLink.click();
	}

}
