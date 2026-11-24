package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng_first
{
@BeforeTest
public void setup()
{
	System.out.println("browser launch");
}
@BeforeMethod
public void url()
{
	System.out.println("url open");
}
@Test(priority=2,dependsOnMethods=("test2"))
public void test()

{
	System.out.println("TEST1");
}
@Test(priority=1,enabled=false)
public void test1()

{
	System.out.println("TEST2");
}
@Test(priority=3,invocationCount=2)
public void test2()
{
	System.out.println("TEST3");
}
@AfterMethod
public void report()
{
	System.out.println("REPOERT");
}
@AfterTest
public void close()
{
	System.out.println("close");

}
}
