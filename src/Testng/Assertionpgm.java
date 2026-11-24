package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionpgm {
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
	public void test()
	{
    SoftAssert Soft=new SoftAssert();
    String title=driver.getTitle();
    Soft.assertEquals(title,"Google","Title is not matching");
    Soft.assertTrue(driver.findElement(By.xpath("/html/body/header/div[1]/div/a[1]")).isDisplayed(),"login button not displayed");
	System.out.println( "Test execution condition");
	Soft.assertAll();
	}
}
