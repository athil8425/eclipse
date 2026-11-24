 package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
    ChromeDriver driver;

    @Before
    public void set() {
        driver = new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }

    @Test
    public void test() {
         WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[20]/input"));click();
        
         String a = driver.findElement(By.xpath("//input[@value='create my account']")).getAttribute("value");
        String b = a;
        System.out.println(b);
    }

	private void click() {
		// TODO Auto-generated method stub
		
	}
}

