package Testng;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpng {

ChromeDriver driver;
@Before
public void setup()
{
   driver=new ChromeDriver();
   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test()
{
	WebElement day=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
	Select day1=new Select(day);
	day1.selectByValue("01");
	List<WebElement>count=day1.getOptions();
	System.out.println(count.size());
	
	
}

}
 