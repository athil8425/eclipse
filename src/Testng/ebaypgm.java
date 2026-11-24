package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebaypgm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void test1()
	{
		WebElement a=driver.findElement(By.xpath("/html/body/main/div[1]/div/div[1]/div/div/ul/li[4]/a"));
		a.click();
	    
		WebElement b=driver.findElement(By.xpath("/html/body/main/div[1]/div/div[1]/div/div/ul/li[1]"));
		b.click();
	}
	@AfterTest
    public void t() {
         if (driver != null) {
            driver.quit();
        }
	}
}
