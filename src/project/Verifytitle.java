package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle {
    public static void main(String[] args) {
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Amazon.in
        driver.get("https://www.amazon.in");

        // Get and verify the page title directly
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);

        if (actualTitle.contains("amazon.in")) {
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }
    }
}