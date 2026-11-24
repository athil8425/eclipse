package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class TutorialsNinjaTest {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void executeAutomationSteps() throws Exception {
        // 1. Open the application in browser[cite: 2]
        driver.get("https://tutorialsninja.com/demo/"); //[cite: 2]

        // 2. Click on 'My Account' Drop Menu and select Register[cite: 2]
        driver.findElement(By.xpath("//span[text()='My Account']")).click(); //[cite: 2]
        driver.findElement(By.linkText("Register")).click();

        // 3. Enter new account details into mandatory fields[cite: 2]
        driver.findElement(By.id("input-firstname")).sendKeys("John"); //[cite: 2]
        driver.findElement(By.id("input-lastname")).sendKeys("Doe"); //[cite: 2]

        WebElement emailField = driver.findElement(By.id("input-email")); //[cite: 2]
        emailField.sendKeys("johndoe" + System.currentTimeMillis() + "@gmail.com"); //[cite: 2]

        driver.findElement(By.id("input-telephone")).sendKeys("9876543210"); //[cite: 2]
        driver.findElement(By.id("input-password")).sendKeys("Password123"); //[cite: 2]
        driver.findElement(By.id("input-confirm")).sendKeys("Password123"); //[cite: 2]
        driver.findElement(By.name("agree")).click(); // Select privacy policy checkbox[cite: 2]

        // 4. Take screenshot of E-mail field[cite: 2]
        File emailScreenshot = emailField.getScreenshotAs(OutputType.FILE); //[cite: 2]
        FileHandler.copy(emailScreenshot, new File("email_field.png")); //[cite: 2]

        // 5. Click on continue button[cite: 2]
        driver.findElement(By.xpath("//input[@value='Continue']")).click(); //[cite: 2]

        // 6. Click on 'continue button' that is displayed in the 'Account Success' page[cite: 2]
        driver.findElement(By.linkText("Continue")).click(); //[cite: 2]

        // 7. Again click on My Account drop down and click logout[cite: 2]
        driver.findElement(By.xpath("//span[text()='My Account']")).click(); //[cite: 2]
        driver.findElement(By.linkText("Logout")).click(); //[cite: 2]

        // 8. Scroll down to bottom of page and Take screenshot of 'sitemap' webelement[cite: 2]
        JavascriptExecutor js = (JavascriptExecutor) driver; //[cite: 2]
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); //[cite: 2]

        WebElement sitemapElement = driver.findElement(By.linkText("Site Map")); //[cite: 2]
        File sitemapScreenshot = sitemapElement.getScreenshotAs(OutputType.FILE); //[cite: 2]
        FileHandler.copy(sitemapScreenshot, new File("sitemap_element.png")); //[cite: 2]

        // 9. Click on contact us link[cite: 2]
        driver.findElement(By.linkText("Contact Us")).click(); //[cite: 2]

        // 10. Enter the details in the contact form and click submit[cite: 2]
        driver.findElement(By.id("input-name")).sendKeys("John Doe"); //[cite: 2]
        driver.findElement(By.id("input-email")).sendKeys("johndoe@gmail.com"); //[cite: 2]
        driver.findElement(By.id("input-enquiry")).sendKeys("This is an automated test enquiry message."); //[cite: 2]
        driver.findElement(By.xpath("//input[@value='Submit']")).click(); //[cite: 2]
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}