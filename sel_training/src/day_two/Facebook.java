package day_two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	
	
	WebDriver driver;
	 
	 @BeforeTest
	 
	 public void Open_facebook() throws InterruptedException
	 {
	  
	    System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "https://www.facebook.com/";
		driver.get(url);
	  //driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  Thread.sleep(2000);
	 }
	  
	 @Test(priority=0)
	 public	 void login() throws InterruptedException{
		  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ishan.mittal@webvirtue.com");
	  driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("moebel123");
	  driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
	    
	 }
	  
	  @Test(priority=1)
	public  void newpost() throws InterruptedException{
	   
	  driver.findElement(By.xpath(".//*[@id='u_0_t']/div/div[2]/textarea")).sendKeys("Hello moebel");
	   //driver.findElement(By.className("_1mf _1mj")).sendKeys("Hello moebel");
	  // driver.findElement(By.xpath(".//*[@id='js_5x']/div[2]/div[3]/div/div[2]/div/button")).click();
	   driver.findElement(By.className("_1mf7 4jy0 4jy3 4jy1 51sy selected _42ft")).click();
	   Thread.sleep(2000);
	   System.out.println("post uploaded");
	   
	  }
	  		  
	  @Test(priority=2)
	  public  void logout() throws InterruptedException{
	   
	   driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.name("fb_dtsg")).click();
	   
	   System.out.println("logout done");
	   
	  }
	  
	
}
