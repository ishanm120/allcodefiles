package testNG_framework;

import org.testng.annotations.Test;

public class SanityTests {
	
	
	@Test
	void sanity1()
	{
		System.out.println("sanity test1");
	}
	
	
	@Test(enabled= false)
	void sanity2()
	{
		System.out.println("sanity test2");
	}
	
	
	@Test(groups="someFeature")
	void sanity3()
	{
		System.out.println("Feature: sanity test3");
	}
	@Test
	void sanity4()
	{
		System.out.println("sanity test4");
	}
	@Test
	void sanity5()
	{
		System.out.println("sanity test5");
	}
}
