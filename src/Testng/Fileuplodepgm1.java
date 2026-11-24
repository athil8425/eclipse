package Testng;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuplodepgm1 
{
	 
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			ChromeDriver driver = new ChromeDriver();
	     }
		@BeforeMethod 
	    public void url() 
	    {
			driver.get("https:www.ilovepdf.com/pdf_to_word");
	    }
		@Test
		public void test1()
		{
	 	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[3]/a/span")).click();
	 	  fileupload("C://ATHIL_AB.pdf");
	    }
		public void fileupload(String p)
		{
			StringSelection strSelection=new StringSelection(p);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, strSelection);
		}
		
	}	







