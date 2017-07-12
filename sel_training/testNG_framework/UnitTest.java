package testNG_framework;

import org.testng.annotations.Test;

public class UnitTest {

	@Test
	void unit1()
	{
		System.out.println("unit test1");
	}	
	@Test(enabled= false)
	void unit2()
	{
		System.out.println("unit test2");
	}
	@Test(groups="someFeature")
	void unit3()
	{
		System.out.println("Feature: unit test3");
	}
	@Test
	void unit4()
	{
		System.out.println("unit test4");
	}
	@Test
	void unit5()
	{
		System.out.println("unit test5");
	}

}
