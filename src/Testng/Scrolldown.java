package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown {
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
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[6]/a/div")).click();
}}



















