package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	
	@BeforeTest
	public void StartDriver() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?hl=ar");
	}
	@AfterTest
	public void StopDriver() 
	{
		driver.quit();
	}
	

}
