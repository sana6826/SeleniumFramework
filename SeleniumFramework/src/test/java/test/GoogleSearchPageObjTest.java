package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageObjTest {
	 private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//GoogleSearchPageObjTest obj = new GoogleSearchPageObjTest();
		//obj.SearchEngine();
		SearchEngine();
	}
	public static void SearchEngine() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ckhanto\\Desktop\\Selenium_workspace\\SeleniumFramework\\drivers\\chdriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 GoogleSearchPageObjects gspObj = new GoogleSearchPageObjects(driver);
		 driver.get("https://google.com");
		 gspObj.setText_textBoxSearch("Automation Step by Step");
		 Thread.sleep(3000);
		 gspObj.buttonSearch_Click();
		 System.out.println("done!!!");
		 driver.close();
	}
	

}
