package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframetest{
@Test
public void iframe()
{
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement Frame1=driver.findElement(By.id("iframe"));
	
	driver.switchTo().frame(Frame1);
	
	WebElement innerFrame=driver.findElement(By.tagName("iframe"));
	
	driver.switchTo().frame(innerFrame);
	
	WebElement text=driver.findElement(By.tagName("h1"));
	
	driver.switchTo().frame(innerFrame);
	 
	System.out.println(text.getText());
	
	driver.switchTo().defaultContent();

}

}
