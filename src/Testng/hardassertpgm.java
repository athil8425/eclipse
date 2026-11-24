package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hardassertpgm {
WebDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
	driver.get("https://keralaproperty.in/");
}
@Test
public void test1()
{
	String actual=driver.getTitle();
	String expected="www.facebook.com";
	Assert.assertEquals(actual,expected,"title verification");
	System.out.println("title");
}
@Test
public void test2()
{
	WebElement search=driver.findElement(By.xpath("/html/body/header/div[1]/div/div/a"));
	boolean searchenable=search.isEnabled();
	Assert.assertTrue(searchenable,"it is not enabled");
	
	
}
}