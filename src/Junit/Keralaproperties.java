package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaproperties {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("ulogin")). sendKeys("abadhil180@gmail.com",Keys.ENTER);
		driver.findElement(By.id("upass")). sendKeys("abadhil",Keys.ENTER);

	}
	}
