package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	static WebDriver driver=null;
	By textbox_search = By.name("q");
	By searchbutton = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setText_textBoxSearch(String text)
	{
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void buttonSearch_Click()
	{
		driver.findElement(searchbutton).click();
	}

}
