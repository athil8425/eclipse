package Testng;

import java.time.Duration;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert; // Fixed: Changed from JUnit to TestNG
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Dtestingpgm {
WebDriver driver;
@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://keralaproperty.in/member/login/");
}
@DataProvider(name="loginData")
public Object[][] getData() throws Exception
{
	String path="C:\\Users\\athil\\OneDrive\\Dokumen";
	return Dtestingpgm.getTestData(path,"sheet1");
}
@Test(dataProvider="logindata")
public void loginTest(String username,String password)
{
	driver.findElement(By.id("ulongin")).sendKeys(username);
	driver.findElement(By.id("upass")).sendKeys(password);
	driver.findElement(By.id(" sub_logbtn")).click();
	System.out.println("Execution for:"+username);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlContains("myhome"));
	String currentUrl=driver.getCurrentUrl();
	System.out.println("Redirected to:"+currentUrl);
	Assert.assertEquals(currentUrl,"https://keralaproperty.in/member/myhome/","Login may have faild for:"+username);

}
@AfterMethod
public void teardown() {
    if (driver != null) {
        driver.quit(); // Fixed: Closes browser windows after each test iteration
    }
}

// Placeholder: Ensure you have this method defined somewhere to handle Excel sheet reading!
public static Object[][] getTestData(String path, String sheetName) throws Exception {
    // Your Excel parsing (Apache POI) code goes here...
    return new Object[][] {}; 
}
}