package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumSitePage extends PageBase {

	public SeleniumSitePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "selenium_logo")
	public WebElement selenium_logo;
	

}
