package testNG_framework;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenShots {
	@Test
	void getscreenshots() throws IOException{
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "https://www.facebook.com/";
		driver.get(url);
		
	 File scrfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 FileUtils.copyFileToDirectory(scrfile,new File("E://ishan"));
	 
	 
	 
	 FileUtils.copyFile(scrfile, new File ("E:\\wv_training\\Screeshots"+System.currentTimeMillis()+" .png"));
		
	}
	
	
	
}
