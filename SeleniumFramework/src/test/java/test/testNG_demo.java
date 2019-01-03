package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_demo {

	static WebDriver driver;
	@BeforeTest
	public void  setUpTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ckhanto\\Desktop\\Selenium_workspace\\SeleniumFramework\\drivers\\chdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}
	
@Test
public void googlesearch() throws InterruptedException
{
	
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	Thread.sleep(3000);
	driver.findElement(By.name("btnK")).click();
	//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	driver.close();
	System.out.println("Successful");
}
//@AfterTest
//public void Teardowntest()
//{
//	driver.close();
//	System.out.println("Successful");
//}
}
