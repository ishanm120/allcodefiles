package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	static WebDriver driver;
	public static void main(String[] args) {
		
		String url;

		System.setProperty("webdriver.chrome.driver", "E:\\Automationdata\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "https://www.gmail.com";
		driver.get(url);

		driver.manage().window().maximize();
		
		caturescreenshot();

	}
	
	public static void caturescreenshot(){
		
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcfile, new File("E:\\screenshots\\abc.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}