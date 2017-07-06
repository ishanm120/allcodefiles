package testNG_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Functional {
	
	
	@BeforeSuite()
	void openbrowser(){
		System.out.println("browser is opened before suite");
	}
	
	@BeforeTest()
	void openurl(){
			
			System.out.println("Application is opened before test");
		}
	
	@BeforeClass()
	void envStetup(){
		
		System.out.println("Env is setup before class");
	}
		
	
	@Test
	void function1()
	{
		System.out.println("Functional test1");
	}
	
	
	@Test(enabled= false)
	void function2()
	{
		System.out.println("Functional test2");
	}
	
	
	@Test(groups="someFeature")
	void function3()
	{
		System.out.println("Feature: Functional test3");
	}
	@Test
	void function4()
	{
		System.out.println("Functional test4");
	}
	@Test
	void function5()
	{
		System.out.println("Functional test5");
	}
	
	@AfterSuite()
	void Closebrowser(){
		System.out.println("browser is closed after suite");
	}
	
	@AfterTest()
	void closeurl(){
			
			System.out.println("Application is closed after test");
		}
	
	@AfterClass()
	void closeEnv(){
		
		System.out.println("Env is closed after class");
	}

}
