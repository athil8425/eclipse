 package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junitgoogleepgm {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @Test
    public void test() {
        // Search for an item and submit
        driver.findElement(By.xpath("//*[contains(@id, 'twotabsearchtextbox')]"))
              .sendKeys("mobile phones", Keys.ENTER);

        // Navigate back to the previous page
        driver.navigate().back();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
