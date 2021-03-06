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
	public void steup() throws MalformedURLException {
		baseurl = "http://google.com";
		nodeurl = "http://192.168.5.60:5555/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		 System.setProperty("webdriver.chrome.driver",
		 System.getProperty("user.dir") + "\\chromedriver.exe");
		
	/*	System.setProperty("webdriver.gecko.driver", "E:\\allcodefiles\\sel_training\\geckodriver.exe");
		driver = new FirefoxDriver();*/
		 driver = new ChromeDriver();
		driver = new RemoteWebDriver(new URL(nodeurl), capability);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void SampleTest() {
		driver.get(baseurl);
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
	}

}
