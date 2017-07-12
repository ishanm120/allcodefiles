package testNG_framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoIduploadFile {
	
	@Test
	
	public void fileuploadAuto() throws Exception{
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "file:///C:/Users/Ishan/Desktop/fileupload.html";
		driver.get(url);
		
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		
	Runtime.getRuntime().exec("E:\\Automationdata\\autoitscripts\\fileupload.exe");
	}

}
