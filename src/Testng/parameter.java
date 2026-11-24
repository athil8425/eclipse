package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
@Parameters("a")
@Test
public void main(String v)
{
	System.out.println("values is:"+v);
}
}
