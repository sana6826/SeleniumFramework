package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pages.GoogleSearchPage;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageObjTest {
	 private static WebDriver driver = null;
	/*public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//GoogleSearchPageObjTest obj = new GoogleSearchPageObjTest();
		//obj.SearchEngine();
	SearchEngine();
	}*/
	 @Test
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
