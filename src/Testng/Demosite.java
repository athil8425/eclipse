package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demosite {
WebDriver driver;
@BeforeTest
public void setup()
{
	  driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	 
}
@Test
public void test1()
{
	WebElement right=driver.findElement(By.xpath("/html/body/span"));
    Actions act = new Actions(driver); 
    act.contextClick(right);
    act.perform();
}

}
 