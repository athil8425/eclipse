package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swanglabs {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(" https://www.saucedemo.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("user-name")). sendKeys("standard_user",Keys.ENTER);
		driver.findElement(By.id("password")). sendKeys("secret_sauce",Keys.ENTER);

	}
	}

