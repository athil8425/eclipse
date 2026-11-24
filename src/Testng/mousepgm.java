package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mousepgm {
	WebDriver driver;
	@BeforeTest

	
public void setup ()
{

driver=new ChromeDriver() ;
driver.manage () .window ().maximize ();
driver.get ("https://www.ebay.com/");
driver.navigate().to("https://www.ebay.com/");
}
@Test
public void test1 ()
{
driver.manage().timeouts ().implicitlyWait(Duration.ofSeconds (30)) ;

WebElement mouse=driver.findElement (By.xpath ("//*[@id=\"vl-flyout-nav\"]/ul/li [4]/a") ) ;
Actions act=new Actions (driver) ;
act.moveToElement (mouse) .perform();

WebDriverWait wait=new WebDriverWait(driver, Duration. ofSeconds (30) );
wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath ("//*[@id=\\\"vl-flyout-nav']")));
driver.findElement (By. xpath("//*[@id=\"vl-flyout-nav\"] /ul/li [4] /div [2] /div[1]/nav[1]/ul/1:"));
}}