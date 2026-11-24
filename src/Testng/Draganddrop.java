 package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; // 1. Added Chrome import
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
WebDriver driver;
@BeforeTest
public void url() { 
    driver = new ChromeDriver(); // 2. Initialized the driver instance here
    driver.get("https://webdriveruniversity.com"); 
} 
@Test
public void test1()
{
	WebElement a =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]"));
	WebElement b=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]")); 
    Actions act = new Actions(driver); 
    act.dragAndDrop(a, b);
    act.perform();
     String actual=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/p/b")).getText();
     String expected = "Dropped!";
    
}
}
