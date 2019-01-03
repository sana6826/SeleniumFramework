package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pages.GmailLogin_Page;

public class GmailLogin_Test {

	static WebDriver driver;
	
	@BeforeTest
	public void LaunchURL()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ckhanto\\Desktop\\Selenium_workspace\\SeleniumFramework\\drivers\\chdriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.gmail.com");
	}
	
	@Test (dataProvider = "testdata")
	public void LoginTest(String username,String password) throws InterruptedException
	{
		GmailLogin_Page obj = new GmailLogin_Page(driver);
		obj.Login(username, password);
		Thread.sleep(3000);
		Assert.assertEquals("https://mail.google.com/mail/u/0/#inbox",driver.getCurrentUrl());
		
		System.out.println("Login Successful");
	}
	
	@DataProvider (name = "testdata")
	public Object [][] readExcel () throws IOException, BiffException
	{
		File src = new File("C:/Users/ckhanto/Desktop/Input1.xls");
		FileInputStream F = new FileInputStream(src);
		
		Workbook w= Workbook.getWorkbook(F);
		Sheet s= w.getSheet("Sheet1");
		int rows=s.getRows();//No of rows
		int columns=s.getColumns();//No  of columns
		
		String inputData [][] = new String [rows][columns];
		for(int i=0; i<rows; i++)
		{
			for(int j=0;j<columns;j++)
			{
				Cell c = s.getCell(j,i);
				inputData[i][j]=c.getContents();
				System.out.println("Input is: "+inputData[i][j]);
			}
			
		}
		
		return inputData;
}
}
