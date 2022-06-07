package Steps;

import org.testng.Assert;

import Pages.GoogleHomePage;
import Pages.SearchResultPage;
import Pages.SeleniumSitePage;
import Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch extends TestBase {
	GoogleHomePage Search_page;
	SearchResultPage SearchResult_page;
	SeleniumSitePage SeleniumSite_page;
	
	@Given("the user in google home page")
	public void the_user_in_google_home_page() {
		Search_page=new GoogleHomePage(driver);
	    Search_page.GoogleSearch("Selenium Webdriver");
	}
	@When("I search for Selenium Webdriver on google")
	public void i_search_for_selenium_webdriver_on_google() {
		SearchResult_page=new SearchResultPage(driver);
		Assert.assertTrue(SearchResult_page.FirstLink.isDisplayed());
	}
	@When("I click on the selenium website link")
	public void i_click_on_the_selenium_website_link() {
		SearchResult_page=new SearchResultPage(driver);
		SearchResult_page.ClickOnFirstLink();
	}
	@Then("The selenium website displayed successfully")
	public void the_selenium_website_displayed_successfully() {
		SeleniumSite_page=new SeleniumSitePage(driver);
		Assert.assertTrue(SeleniumSite_page.selenium_logo.isDisplayed());
	}

}
