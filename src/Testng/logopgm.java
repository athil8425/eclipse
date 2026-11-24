package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logopgm {
WebDriver driver;
@BeforeTest
public void setup()
{
	ChromeDriver driver = new ChromeDriver();

}
@BeforeMethod
public void url()
{
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void verifyLogo()
{
	boolean b1 =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img")).isDisplayed();
	if(b1)
	{
		System.out.println("");
	}
}
}

