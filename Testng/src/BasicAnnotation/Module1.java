package BasicAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module1 
{
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("Before Module1");
	}
	
	@AfterClass
	public void AfterModule()
	{
		System.out.println("After Module1");
	}
	@BeforeMethod
	public void beforeTestScript()
	{
		System.out.println("Before Test Script1");
	}
	
	@AfterMethod
	public void afterTestScript()
	{
		System.out.println("After Test Script1");
	}
	
	
	@Test //annotation
	public void test1()
	{
		System.out.println("Login test case1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Logout test case1");
	}

}
