package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends PageBase {

	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}
	// Define Elements needed in the page 
	
	@FindBy(name = "q")
	WebElement SearchField;
	
	@FindBy(name = "btnK")
	WebElement SearchBtn;
	
	
	// Actions on this elements
	
	public void GoogleSearch(String Text) 
	{
		SearchField.sendKeys(Text);
		SearchBtn.submit();
	}

}
