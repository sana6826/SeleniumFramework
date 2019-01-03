package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;
public class GoogleSearchTest {

	private static WebDriver driver = null;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GoogleSearchTest googlesearchtest = new GoogleSearchTest();
		googlesearchtest.BrowserLaunch();
		googlesearchtest.URLLaunch();
		googlesearchtest.SearchEngine();
		googlesearchtest.closeBrowser();

	}
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ckhanto\\Desktop\\Selenium_workspace\\SeleniumFramework\\drivers\\chdriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	public void URLLaunch()
	{
		driver.get("https://www.google.com");
	}
	
	public void SearchEngine() throws InterruptedException
	{
		GoogleSearchPage.googleSearchTextBox(driver).sendKeys("Automation Step by Step");
		Thread.sleep(3000);
		GoogleSearchPage.buttonSearch(driver).click();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}

}
