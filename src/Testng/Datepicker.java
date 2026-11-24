package Testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
WebDriver driver;
@BeforeTest
public void setup()

{
	driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	
}
@Test
public void testlogin()
{
	driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
while(true)
{
WebElement month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]"));
String month1=month.getText();
 if(month1.equalsIgnoreCase("september"))
{
	System.out.println(month1);

	break;
}
else
{
 	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).click();
}
}
List<WebElement>alldates1=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td /a"));
for(WebElement dateelement:alldates1)
{
	String date=dateelement.getText();
 if(date.equals("28"))
		{
	dateelement.click();
	break;
		}	
}
}}


