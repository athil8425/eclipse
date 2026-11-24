     package Junit;

import java.util.List;
import java.net.URL;
import java.net.HttpURLConnection;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_linkpgm {
    ChromeDriver driver;

    @Before
    public void set() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void test() {
        List<WebElement> li = driver.findElements(By.tagName("a"));
        for (WebElement s : li) {
            String link = s.getAttribute("href");
            if (link != null && !link.isEmpty()) {
                verify(link);
            }
        }
    }

    public void verify(String link) {
        try {
            URL ob = new URL(link);
            HttpURLConnection con = (HttpURLConnection) ob.openConnection();
            con.connect();
            
            if (con.getResponseCode() == 200) {
                System.out.println("valid --- " + link);
            } else if (con.getResponseCode() == 404) {
                System.out.println("broken link ---- " + link);
            }
        } catch (Exception e) {
            // Handle exceptions like malformed URLs or timeouts
        }
    }
}
