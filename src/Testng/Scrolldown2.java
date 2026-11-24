package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown2 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		  driver = new ChromeDriver();

	} 
	@BeforeMethod
	public void url()
	{
		driver.get("https://keralaproperty.in/");
	}
	@Test
	public void test1()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//	js.executeScript("window.scrollBy(0,1000)","");
		js.executeScript("arguments[0].scrollintoView();",driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/h2")));
		WebElement t=driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/form/div[1]/input"));
		t.sendKeys("abc");
		
	}}



