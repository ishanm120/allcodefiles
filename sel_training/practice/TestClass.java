package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestClass {
	
	public static WebDriver driver;


		@BeforeMethod
		public void lanuchbrowser(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver = new ChromeDriver();
		
	    String Url= "https://www/moebel.de/kontakt";
	    driver.get(Url);
		}
		@Test
		public void formfill(){
		driver.findElement(By.xpath(".//*[@id='herrId']")).click();

		driver.findElement(By.xpath(".//*[@id='vorname']")).sendKeys("ishan");
		
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("mittal");
		
		driver.findElement(By.xpath(".//*[@id='emailAddress']")).sendKeys("ishan@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='kontaktform']/div[8]/div/input")).click();
		
		driver.findElement(By.xpath(".//*[@id='nachricht']")).sendKeys("testing text");
		
		driver.findElement(By.xpath(".//*[@id='kontaktform']/div[15]/input")).click();
		}
		
		@AfterMethod
		public void closebrowser(){
	   driver.quit();
		}

	}


