package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.GoogleHomePage;
import Pages.SearchResultPage;
import Pages.SeleniumSitePage;

public class GoogleSearch_Test extends TestBase {
	
	GoogleHomePage Search_page;
	SearchResultPage SearchResult_page;
	SeleniumSitePage SeleniumSite_page;
	
	//check that user can search for anything and assert on test result "first link"
	@Test(priority = 1)
	public void UserCanSearchSuccessfully() 
	{
		Search_page=new GoogleHomePage(driver);
		Search_page.GoogleSearch("Selenium Webdriver");
		SearchResult_page=new SearchResultPage(driver);
		Assert.assertTrue(SearchResult_page.FirstLink.isDisplayed());
	}
	
	// check that user can click on the selenium site link and assert on the logo 
	@Test(priority = 2, dependsOnMethods = "UserCanSearchSuccessfully")
	public void UserCanOpenSeleniumSite() 
	{
		SearchResult_page=new SearchResultPage(driver);
		SearchResult_page.ClickOnFirstLink();
		SeleniumSite_page=new SeleniumSitePage(driver);
		Assert.assertTrue(SeleniumSite_page.selenium_logo.isDisplayed());
	}

}
