package testNG_framework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridImplement {
	
	
	WebDriver driver;
	String baseurl, nodeurl;

	@BeforeTest
	public void steup() throws MalformedURLException{
		baseurl= "http://google.com";
		nodeurl= "http://192.168.5.60:5555/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("firefox");                           
		capability.setPlatform(Platform.VISTA);   
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
	//	
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\Browsers\\geckodriver.exe");
		 driver = new FirefoxDriver();
	//	driver = new ChromeDriver();
		driver = new RemoteWebDriver(new URL(nodeurl), capability); 
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
	
	
	@Test
	public void SampleTest()
	{
		driver.get(baseurl);
		Assert.assertEquals("Google", driver.getTitle());
	}
	


}
